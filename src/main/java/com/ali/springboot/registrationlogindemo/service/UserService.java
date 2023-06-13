package com.ali.springboot.registrationlogindemo.service;

import com.ali.springboot.registrationlogindemo.dto.UserDto;
import com.ali.springboot.registrationlogindemo.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
