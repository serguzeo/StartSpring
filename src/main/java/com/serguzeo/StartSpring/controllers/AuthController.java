package com.serguzeo.StartSpring.controllers;

import com.serguzeo.StartSpring.dto.LoginDto;
import com.serguzeo.StartSpring.dto.RegisterDto;
import com.serguzeo.StartSpring.services.I.IAuthService;
import com.serguzeo.StartSpring.services.I.IRegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthController {
    private IAuthService authService;
    private IRegistrationService registrationService;

    @PostMapping("login")
    public ResponseEntity<Map<String, String>> login(@RequestBody LoginDto loginDto) {
        return authService.login(loginDto);
    }

    @PostMapping("register")
    public ResponseEntity<Map<String, String>> register(@RequestBody RegisterDto registerDto) {
        return registrationService.register(registerDto);
    }
}
