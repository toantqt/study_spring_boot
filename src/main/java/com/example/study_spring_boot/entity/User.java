package com.example.study_spring_boot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_system")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String username;
    private  String password;
}
