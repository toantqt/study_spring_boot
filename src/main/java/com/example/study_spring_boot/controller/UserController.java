package com.example.study_spring_boot.controller;

import com.example.study_spring_boot.dto.request.UserRequest;
import com.example.study_spring_boot.dto.response.UserResponse;
import com.example.study_spring_boot.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// @Controller => Spring MVC
@RestController // => Spring Rest API
@RequestMapping(name = "/api/v1/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity <List<UserResponse>> showListUser() {
        return new ResponseEntity<>(userService.showListUser(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> createUser(UserRequest userRequest) {
        return new ResponseEntity<>("Create User Successfully", HttpStatus.CREATED);
    }
}
