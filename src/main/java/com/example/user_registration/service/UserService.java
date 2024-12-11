package com.example.user_registration.service;

import com.example.user_registration.dto.request.UserRegisterRequestDto;
import com.example.user_registration.dto.response.BaseResponse;

import java.awt.*;
import java.util.HashMap;

public interface UserService {

    BaseResponse<HashMap<String, Object>> registration(UserRegisterRequestDto registerRequest);

}
