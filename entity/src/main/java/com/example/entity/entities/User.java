package com.example.entity.entities;

import com.sun.istack.NotNull;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity(name = "User")
@Table(name = "\"user\"")
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor

public class User extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "username",nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Version
    @Column(name = "version")
    private  Integer version;
}
