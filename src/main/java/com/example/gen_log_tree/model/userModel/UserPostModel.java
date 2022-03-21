package com.example.gen_log_tree.model.userModel;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserPostModel {

    private String login;
    private String password;
    private String email;
}
