package com.example.gen_log_tree.service.impl;

import com.example.gen_log_tree.entity.RoleEntity;
import com.example.gen_log_tree.entity.UserEntity;
import com.example.gen_log_tree.repository.RoleRepository;
import com.example.gen_log_tree.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;
    @Override
    public RoleEntity roleEntity(UserEntity entity) {
        RoleEntity roleEntity = roleRepository.findByUserEntity(entity).orElse(null);
        return roleEntity;
    }

    @Override
    public RoleEntity newRole(RoleEntity entity) {
        RoleEntity getRole = roleRepository.save(entity);
        return getRole;
    }
}
