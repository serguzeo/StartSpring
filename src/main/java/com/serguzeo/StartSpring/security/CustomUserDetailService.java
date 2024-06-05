package com.serguzeo.StartSpring.security;


import com.serguzeo.StartSpring.models.Role;
import com.serguzeo.StartSpring.models.UserEntity;
import com.serguzeo.StartSpring.services.I.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CustomUserDetailService implements UserDetailsService {
    private IUserService userService;

    public UserDetails loadUserByLogin(String login) throws UsernameNotFoundException {
        UserEntity user = userService.findByUsernameOrEmail(login, login).orElseThrow(() -> new UsernameNotFoundException("User not found"));
        return new User(user.getUsername(), user.getPassword(),mapRolesToAuthorities(user.getRoles()));
    }

    private Collection<GrantedAuthority> mapRolesToAuthorities(List<Role> roles) {
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userService.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User not found"));
        return new User(user.getUsername(), user.getPassword(),mapRolesToAuthorities(user.getRoles()));
    }
}
