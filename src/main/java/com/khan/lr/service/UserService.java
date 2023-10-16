package com.khan.lr.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.khan.lr.model.User;
import com.khan.lr.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

	User save(UserRegistrationDto registrationDto);
}
