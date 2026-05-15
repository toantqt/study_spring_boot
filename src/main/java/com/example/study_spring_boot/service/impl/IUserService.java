package com.example.study_spring_boot.service.impl;

import com.example.study_spring_boot.dto.request.UserRequest;
import com.example.study_spring_boot.dto.response.UserResponse;
import com.example.study_spring_boot.entity.User;
import com.example.study_spring_boot.repository.UserRepository;
import com.example.study_spring_boot.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IUserService implements UserService {
    private final UserRepository userRepo;

//    public IUserService(UserRepository userRepo) {
//        this.userRepo = userRepo;
//    }
//    ko cần để thang nay neu cos RequiredArgsConstructor

    @Override
    public void createUser(UserRequest request) {
        userRepo.save(maptoEntity(request));
    }

    @Override
    public void updateUser(String id, UserRequest request) {

    }

    @Override
    public List<UserResponse> showListUser() {
        return List.of();
    }

    private User maptoEntity(UserRequest request) {
        return User.builder()
                .name(request.getName())
                .address(request.getAddress())
                .email(request.getEmail())
                .password(request.getPassword())
                .username(request.getUsername())
                .phone(request.getPhone())
                .build();
    }
}
