package com.example.gen_log_tree.repository;

import com.example.gen_log_tree.entity.RoleEntity;
import com.example.gen_log_tree.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
    Optional<RoleEntity> findByUserEntity(UserEntity entity);
}
