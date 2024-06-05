package com.serguzeo.StartSpring.services.impl;

import com.serguzeo.StartSpring.dto.LoginDto;
import com.serguzeo.StartSpring.services.I.IAuthService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Map;

@Service
@AllArgsConstructor
@Primary
public class AuthServiceImpl implements IAuthService {

    private final AuthenticationManager authenticationManager;

    @Override
    public ResponseEntity<Map<String, String>> login(LoginDto loginDto) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginDto.getLogin(),
                        loginDto.getPassword()
                )
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);
        return new ResponseEntity<>(Collections.singletonMap("response", "Authenticated!"), HttpStatus.OK);
    }
}
