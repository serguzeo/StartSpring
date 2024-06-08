package com.serguzeo.StartSpring.services.I;

import com.serguzeo.StartSpring.dto.UserDto;
import com.serguzeo.StartSpring.models.UserEntity;
import org.springframework.http.ResponseEntity;

import java.util.Optional;
import java.util.UUID;

public interface IUserService {
    UserEntity save(UserEntity user);

    ResponseEntity<UserDto> findByUuid(UUID uuid);
    Optional<UserEntity> findByUsername(String username);
    Optional<UserEntity> findByEmail(String email);
    Optional<UserEntity> findByUsernameOrEmail(String username, String email);

    Boolean existsByEmail(String email);
    Boolean existsByUsername(String username);
    Boolean existsByUsernameOrEmail(String username, String email);
}
