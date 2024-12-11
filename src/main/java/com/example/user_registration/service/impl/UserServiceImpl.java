package com.example.user_registration.service.impl;

import com.example.user_registration.dto.request.UserRegisterRequestDto;
import com.example.user_registration.dto.response.BaseResponse;
import com.example.user_registration.entity.User;
import com.example.user_registration.repository.UserRepository;
import com.example.user_registration.service.UserService;
import com.example.user_registration.utils.ResponseCodeUtil;
import com.example.user_registration.utils.ResponseUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository userRepository;

    public BaseResponse<HashMap<String, Object>> registration(UserRegisterRequestDto registerRequest) {
        try {
            String name = registerRequest.getName();
            String email = registerRequest.getEmail();
            String mobile = registerRequest.getMobile();

        } catch (Exception e) {
//            log.error("registration -> Exception : {}", e.getMessage(), e);
            return BaseResponse.<HashMap<String, Object>>builder()
                    .code(ResponseCodeUtil.INTERNAL_SERVER_ERROR_CODE)
                    .title(ResponseUtil.INTERNAL_SERVER_ERROR)
                    .message("Error occurred while registration appUser")
                    .build();
        } return null;
    }
}
