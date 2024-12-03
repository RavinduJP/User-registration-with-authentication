package com.example.user_registration.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegisterRequestDto {
    private String name;
    private String email;
    private String mobile;
}
