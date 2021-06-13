package com.masco.security.service;

import com.masco.security.entity.CustomUser;
import com.masco.security.repository.CustomUserRepository;
import com.masco.security.userManagement.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    CustomUserRepository customUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<CustomUser> userList = customUserRepository.findById(username);
        if (userList.isEmpty()) {
            throw new UsernameNotFoundException("User Not Present with the given Username");
        }
        return new CustomUserDetails(userList.get());
    }
}
