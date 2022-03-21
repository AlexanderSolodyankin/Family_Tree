package com.example.gen_log_tree.service.impl;

import com.example.gen_log_tree.entity.UserEntity;
import com.example.gen_log_tree.model.userModel.UserPostModel;
import com.example.gen_log_tree.repository.UserRepository;
import com.example.gen_log_tree.service.DecoderServise;
import com.example.gen_log_tree.service.UserServes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiseImpl implements UserServes {

    @Autowired
    UserRepository userRepository;

    @Autowired
    DecoderServise decoderServise;

    @Override
    public List<UserEntity> getAll() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity newUser(UserEntity entity) {
        UserEntity checkUser = userRepository.findByLogin(entity.getLogin()).orElse(null);
        if(checkUser == null){
            entity.setPassword(decoderServise.encoder(entity.getPassword()));
            entity.setActivationCode(decoderServise.encoder(entity.getLogin()) + decoderServise.encoder(entity.getPassword()));
            entity.setIsActive(0L);
            return userRepository.save(entity);
        }
        return  null;
    }

    @Override
    public UserEntity activeUser(String activCode) {
        UserEntity entity = userRepository.findByActivationCode(activCode).orElse(null);
        if(entity != null){
            entity.setIsActive(1L);
            return userRepository.save(entity);
        }
        return null;
    }

    @Override
    public UserEntity deleteUser(UserEntity entity) {
        userRepository.delete(entity);
        return entity;
    }

    @Override
    public UserEntity logIn(UserPostModel userPostModel) {
        UserEntity entity = userRepository.findByLogin(userPostModel.getLogin()).orElse(null);

        return entity;
    }

    @Override
    public Boolean checkPassword(String entityPassword, String modelPassword) {
        return null;
    }


}
