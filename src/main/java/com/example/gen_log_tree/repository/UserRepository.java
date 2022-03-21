package com.example.gen_log_tree.repository;

import com.example.gen_log_tree.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByActivationCode(String activationCode);
    Optional<UserEntity> findByLogin(String login);
}
