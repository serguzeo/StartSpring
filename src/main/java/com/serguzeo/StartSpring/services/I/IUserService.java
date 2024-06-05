package com.serguzeo.StartSpring.services.I;

import com.serguzeo.StartSpring.models.UserEntity;

import java.util.Optional;
import java.util.UUID;

public interface IUserService {
    UserEntity save(UserEntity user);

    Optional<UserEntity> findByUuid(UUID uuid);
    Optional<UserEntity> findByUsername(String username);
    Optional<UserEntity> findByEmail(String email);
    Optional<UserEntity> findByUsernameOrEmail(String username, String email);

    Boolean existsByEmail(String email);
    Boolean existsByUsername(String username);
    Boolean existsByUsernameOrEmail(String username, String email);
}
