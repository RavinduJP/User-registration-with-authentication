package com.example.user_registration.controller;

import com.example.user_registration.dto.request.UserRegisterRequestDto;
import com.example.user_registration.dto.response.DefaultResponse;
import com.example.user_registration.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @PostMapping(value = "/register")
    public ResponseEntity<DefaultResponse> registration(@Valid @RequestBody UserRegisterRequestDto registerRequestDto) {

    }
}
