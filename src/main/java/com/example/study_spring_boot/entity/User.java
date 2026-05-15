package com.example.study_spring_boot.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_system")
@Getter //giup lay getter ma ko can khai bao nhu trc
@Setter //giup lay setter ma ko can khai bao nhu trc
@NoArgsConstructor
@AllArgsConstructor
@Builder // Giúp cho các bạn có thể insert vào User một các dễ dàng hơn thay vì các bạn phải contructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    @Column(name = "address", length = 30)
    private String address;
    @Column(name = "phone", length = 10)
    private String phone;
    @Column(unique = true)
    private String email;
    private String username;
    private String password;
}
