package com.dk.project.uber.uberApp.services;

import com.dk.project.uber.uberApp.dto.SignUpDto;

public interface AuthService {
    void login(String email, String password);

    UserDto signup(SignUpDto signUpDto);




}
