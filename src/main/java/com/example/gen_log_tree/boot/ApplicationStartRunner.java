//package com.example.gen_log_tree.boot;
//
//
//import com.example.gen_log_tree.entity.RoleEntity;
//import com.example.gen_log_tree.entity.UserEntity;
//import com.example.gen_log_tree.repository.UserRepository;
//import com.example.gen_log_tree.service.RoleService;
//import com.example.gen_log_tree.service.UserServes;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class ApplicationStartRunner implements CommandLineRunner {
//    @Autowired
//    private UserServes userServes;
//    @Autowired
//    private RoleService roleService;
//    @Autowired
//    private UserRepository userRepository;
//
//
//    @Override
//    public void run(String... args) throws Exception {
//        UserEntity larisa = userServes.logIn("Larisa");
//        if(larisa == null){
//            larisa.setLogin("Larisa");
//            larisa.setPassword("491218333010alex");
//            larisa.setEmail("larisazhitnikova335@gmail.com");
//            larisa.setIsActive(1L);
//            larisa = userRepository.save(larisa);
//
//            RoleEntity roleEntity = new RoleEntity();
//            roleEntity.setUserEntity(larisa);
//            roleEntity.setRoleName("ROLE_ADMIN");
//            roleEntity.setActive(1L);
//            roleService.newRole(roleEntity);
//        }
//    }
//}
