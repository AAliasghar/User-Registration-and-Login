package com.ali.springboot.registrationlogindemo.security;


import com.ali.springboot.registrationlogindemo.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    

}
