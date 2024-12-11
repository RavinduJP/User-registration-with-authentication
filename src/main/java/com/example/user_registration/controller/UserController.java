package com.example.user_registration.controller;

import com.example.user_registration.dto.request.UserRegisterRequestDto;
import com.example.user_registration.dto.response.BaseResponse;
import com.example.user_registration.dto.response.DefaultResponse;
import com.example.user_registration.service.UserService;
import com.example.user_registration.utils.ResponseCodeUtil;
import com.example.user_registration.utils.ResponseUtil;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @PostMapping(value = "/register")
    public ResponseEntity<DefaultResponse> registration(@Valid @RequestBody UserRegisterRequestDto registerRequest) {
        BaseResponse<HashMap<String, Object>> response = userService.registration(registerRequest);
        if (response.getCode().equals(ResponseCodeUtil.SUCCESS_CODE)){
            return ResponseEntity.ok(DefaultResponse.success(ResponseUtil.SUCCESS, response.getMessage(), response.getData()));
        } else if (response.getCode().equals(ResponseCodeUtil.INTERNAL_SERVER_ERROR_CODE)) {
            return ResponseEntity.internalServerError().body(DefaultResponse.internalServerError(ResponseCodeUtil.INTERNAL_SERVER_ERROR_CODE, response.getMessage()));
        } else {
            return ResponseEntity.badRequest().body(DefaultResponse.error(ResponseUtil.FAILED, response.getMessage(), response.getData()));
        }
    }
}
