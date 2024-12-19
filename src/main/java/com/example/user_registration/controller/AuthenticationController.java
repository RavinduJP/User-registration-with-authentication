package com.example.user_registration.controller;

import com.example.user_registration.dto.request.AuthenticationRequestDto;
import com.example.user_registration.dto.request.UserRegisterRequestDto;
import com.example.user_registration.dto.response.AuthenticationResponse;
import com.example.user_registration.entity.User;
import com.example.user_registration.service.AuthenticationService;
import com.example.user_registration.service.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;
    private final JwtService jwtService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody UserRegisterRequestDto registerRequest
    ) {
        return ResponseEntity.ok(authenticationService.register(registerRequest));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequestDto authenticationRequest) {
        AuthenticationResponse authenticatedUser = authenticationService.authenticate(authenticationRequest);
        String jwtToken = jwtService.generateToken((UserDetails) authenticatedUser);
        AuthenticationResponse authenticationResponse = new AuthenticationResponse().setToken(jwtToken).setExpiresIn(jwtService.getExpirationTime());
        return ResponseEntity.ok(new AuthenticationResponse());
    }
}
