package com.ionhax.dietplanner.dietplanner.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import com.ionhax.dietplanner.dietplanner.dto.UserDataDto;
import com.ionhax.dietplanner.dietplanner.entity.UserData;
import com.ionhax.dietplanner.dietplanner.entity.Enumerate.Role;
import com.ionhax.dietplanner.dietplanner.repository.UserDataRepository;

@Service
@Transactional
@RequiredArgsConstructor

public class UserDataService {
    
    @Autowired
	private UserDataRepository userRepository;

	public ResponseEntity<String> addUser(UserDataDto user) {
		Optional<UserData> isUserExists = userRepository.findByEmail(user.getEmail());

		if (isUserExists.isPresent()) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body("User with this email already exists");
		} else {
			UserData n = UserData.builder()
					.name(user.getName())
					.email(user.getEmail())
					.password(user.getPassword())
					.role(Role.USER)
					.build();
			userRepository.save(n);
			return ResponseEntity.status(HttpStatus.OK).body("User saved successfully");
		}
	}


}
