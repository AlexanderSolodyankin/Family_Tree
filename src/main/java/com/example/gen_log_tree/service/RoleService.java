package com.example.gen_log_tree.service;

import com.example.gen_log_tree.entity.RoleEntity;
import com.example.gen_log_tree.entity.UserEntity;

public interface RoleService {
    RoleEntity roleEntity(UserEntity entity);
    RoleEntity newRole(RoleEntity entity);


}
