package com.example.study_spring_boot.service;

import com.example.study_spring_boot.dto.request.UserRequest;
import com.example.study_spring_boot.dto.response.UserResponse;

import java.util.List;

public interface UserService {

    void createUser(UserRequest request);

    void updateUser(String id, UserRequest request);

    List<UserResponse> showListUser();


}
