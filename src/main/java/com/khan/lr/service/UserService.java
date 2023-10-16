package com.khan.lr.service;

import com.khan.lr.model.User;
import com.khan.lr.web.dto.UserRegistrationDto;

public interface UserService {

	User save(UserRegistrationDto registrationDto);
}
