package com.example.gen_log_tree.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "role_entity")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     private Long active;
     private String roleName;

     @ManyToOne
     @JoinColumn(name = "user_entity_id")
    private UserEntity userEntity;
}
