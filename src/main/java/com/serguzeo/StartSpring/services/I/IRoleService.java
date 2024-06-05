package com.serguzeo.StartSpring.services.I;

import com.serguzeo.StartSpring.models.Role;

import java.util.Optional;

public interface IRoleService {
    Role save(Role role);
    Optional<Role> findByName(String roleName);
}
