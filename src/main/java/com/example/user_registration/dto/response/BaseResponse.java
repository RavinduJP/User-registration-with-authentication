package com.example.user_registration.dto.response;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class BaseResponse<T> {
    private String code;
    private String title;
    private String message;
    private T data;

}
