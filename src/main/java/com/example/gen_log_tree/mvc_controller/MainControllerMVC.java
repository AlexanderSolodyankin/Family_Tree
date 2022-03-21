package com.example.gen_log_tree.mvc_controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/")
public class MainControllerMVC {
    @GetMapping("/")
    public String menu(Model model){
        model.addAttribute("main","Главное меню");
        return "main";
    }
}
