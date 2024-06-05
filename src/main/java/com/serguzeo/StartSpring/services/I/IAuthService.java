package com.serguzeo.StartSpring.services.I;

import com.serguzeo.StartSpring.dto.LoginDto;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface IAuthService {
    ResponseEntity<Map<String, String>> login(LoginDto loginDto);
}
