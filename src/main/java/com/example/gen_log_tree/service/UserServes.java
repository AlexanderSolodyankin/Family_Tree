package com.example.gen_log_tree.service;

import com.example.gen_log_tree.entity.UserEntity;
import com.example.gen_log_tree.model.userModel.UserPostModel;

import java.util.List;

public interface UserServes {
    List<UserEntity> getAll();
    UserEntity newUser(UserEntity entity);
    UserEntity activeUser(String activCode);
    UserEntity deleteUser(UserEntity entity);
    UserEntity logIn(UserPostModel userPostModel);
    Boolean checkPassword(String entityPassword, String modelPassword);
    UserEntity convertUser(UserPostModel postModel);
    UserEntity logIn(String login);

}
