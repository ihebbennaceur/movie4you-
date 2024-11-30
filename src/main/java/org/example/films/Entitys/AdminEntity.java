package com.example.demo.Entitys;
import jakarta.validation.constraints.NotBlank;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.io.Serializable;

@Entity
@Data
@Table(name="admins")
public class AdminEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false,name="username_admin")

    @NotBlank(message = "Username cannot be empty")
    private String username;

    @Column(nullable=false,name="password_admin")
    private String password;

}
