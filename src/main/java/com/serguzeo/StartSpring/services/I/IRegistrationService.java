package com.serguzeo.StartSpring.services.I;

import com.serguzeo.StartSpring.dto.RegisterDto;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface IRegistrationService {
    ResponseEntity<Map<String, String>> register(RegisterDto registerDto);
}
