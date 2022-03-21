package com.example.gen_log_tree.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "user_entity")
@ToString
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = true)
    private String login;

    @Column(nullable = true)
    private String password;

    @Column(unique = false, nullable = true)
    private String email;

    private LocalDateTime createDate;
    private Long isActive;
    private String activationCode;

    @PrePersist
    public void prePersistCreateData() {
        this.createDate = LocalDateTime.now();
    }


}
