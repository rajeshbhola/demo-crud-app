package com.bholacodecamp.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //@NotBlank(message = "Name is mandatory")
    private String name;

    //@NotBlank(message = "Email is mandatory")
    private String email;

    // Getters and Setters
}

