package com.ionhax.dietplanner.dietplanner.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ionhax.dietplanner.dietplanner.dto.ExperienceDto;
import com.ionhax.dietplanner.dietplanner.repository.ExperienceRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import com.ionhax.dietplanner.dietplanner.entity.Experience;

@Service
@Transactional
@RequiredArgsConstructor

public class ExperienceService {
    @Autowired
	private ExperienceRepository userRepository;

	public ResponseEntity<String> addUser(ExperienceDto user) {
		Optional<Experience> isUserExists = userRepository.findByTitle(user.getTitle());

		if (isUserExists.isPresent()) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Data already exists");
		} else {
			Experience n = Experience.builder()
					.title(user.getTitle())
					.content(user.getContent())
					.build();
			userRepository.save(n);
			return ResponseEntity.status(HttpStatus.OK).body("Data saved successfully");
		}
	}


}
