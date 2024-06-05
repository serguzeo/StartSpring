package com.serguzeo.StartSpring.services.impl;

import com.serguzeo.StartSpring.dto.RegisterDto;
import com.serguzeo.StartSpring.models.Role;
import com.serguzeo.StartSpring.models.UserEntity;
import com.serguzeo.StartSpring.services.I.IRegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.serguzeo.StartSpring.services.I.IUserService;
import com.serguzeo.StartSpring.services.I.IRoleService;

import java.util.Collections;
import java.util.Map;

@Service
@AllArgsConstructor
@Primary
public class RegistrationServiceImpl implements IRegistrationService{
    private final IUserService userService;
    private final IRoleService roleService;
    private final PasswordEncoder passwordEncoder;

    public ResponseEntity<Map<String, String>> register(RegisterDto registerDto) {
        if (userService.existsByUsername(registerDto.getUsername())) {
            return new ResponseEntity<>(Collections.singletonMap("response", "Username is taken!"), HttpStatus.BAD_REQUEST);
        }
        if (userService.existsByEmail(registerDto.getEmail())) {
            return new ResponseEntity<>(Collections.singletonMap("response", "Email is already in use!"), HttpStatus.BAD_REQUEST);
        }

        UserEntity user = new UserEntity();
        user.setUsername(registerDto.getUsername());
        user.setFirstName(registerDto.getFirstName());
        user.setLastName(registerDto.getLastName());
        user.setDateOfBirth(registerDto.getDateOfBirth());
        user.setEmail(registerDto.getEmail());
        user.setPassword(passwordEncoder.encode(registerDto.getPassword()));

        Role role = roleService.findByName("USER").get();
        user.setRoles(Collections.singletonList(role));

        userService.save(user);

        return new ResponseEntity<>(Collections.singletonMap("response", "User registered successfully!"), HttpStatus.CREATED);
    }
}
