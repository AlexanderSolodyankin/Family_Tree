package com.example.gen_log_tree.mvc_controller;

import com.example.gen_log_tree.entity.UserEntity;
import com.example.gen_log_tree.model.userModel.UserPostModel;
import com.example.gen_log_tree.service.DecoderServise;
import com.example.gen_log_tree.service.UserServes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller("/")
public class MainControllerMVC {
    @Autowired
    private UserServes userServes;
    @Autowired
    private DecoderServise decoder;
    @GetMapping("/")
    public String menu(Model model){
        model.addAttribute("main","Главное меню");
        return "main";
    }
//    @GetMapping("/login")
//    public String user(Model model){
//        model.addAttribute("main", "Вход на сайт");
//        UserPostModel user = new UserPostModel();
//        model.addAttribute("userlog", user);
//        return "login";
//    }
//
//    @PostMapping("/login")
//    public String logIn(@ModelAttribute("login") UserPostModel userlog, Model model){
////        userServes.newUser(userServes.convertUser(userlog));
//        UserEntity entity = userServes.logIn(userlog);
//        if(entity == null) {
//            return "main";
//        }else return "adminRoom";
//    }
//
//    @GetMapping("/adminRoom")
//    public String adminRoom(Model model){
//        model.addAttribute("main", "Комната админа");
//        return "adminRoom";
//    }
}
