package com.example.study_spring_boot.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserRequest {
    private String name;
    private String address;
    private String phone;
    private String email;
    private String username;
    private String password;
}
