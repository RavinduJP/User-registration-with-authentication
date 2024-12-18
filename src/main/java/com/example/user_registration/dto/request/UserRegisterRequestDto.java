package com.example.user_registration.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRegisterRequestDto {
    private String name;
    private String email;
    private String mobile;
    private String password;
    private String role;
    private Data createdAt;
}
