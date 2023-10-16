package com.khan.lr.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khan.lr.model.Role;
import com.khan.lr.model.User;
import com.khan.lr.repository.UserRepository;
import com.khan.lr.web.dto.UserRegistrationDto;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserRepository userRepository;
	
	@Override
	public User save(UserRegistrationDto registrationDto) {
		User user =  new User(registrationDto.getFirstName(),
				registrationDto.getLastName(),registrationDto.getEmail(),
				registrationDto.getPassword(),Arrays.asList(new Role("ROLE_User")));

		return userRepository.save(user);
	}

	
}
