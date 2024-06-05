package com.serguzeo.StartSpring.services.impl;

import com.serguzeo.StartSpring.models.Role;
import com.serguzeo.StartSpring.repositories.IRoleRepository;
import com.serguzeo.StartSpring.services.I.IRoleService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
@Primary
public class RoleServiceImpl implements IRoleService {
    IRoleRepository repository;

    @Override
    public Role save(Role role) {
        return repository.save(role);
    }

    @Override
    public Optional<Role> findByName(String roleName) {
        return repository.findByName(roleName);
    }
}
