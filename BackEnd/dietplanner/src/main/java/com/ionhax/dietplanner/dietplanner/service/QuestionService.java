package com.ionhax.dietplanner.dietplanner.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

import com.ionhax.dietplanner.dietplanner.dto.QuestionsDto;
import com.ionhax.dietplanner.dietplanner.entity.Questions;
import com.ionhax.dietplanner.dietplanner.repository.QuestionRepository;

@Service
@Transactional
@RequiredArgsConstructor
public class QuestionService {
    @Autowired
	private QuestionRepository userRepository;

	public ResponseEntity<String> addUser(QuestionsDto user) {
		Optional<Questions> isUserExists = userRepository.findByTitle(user.getTitle());

		if (isUserExists.isPresent()) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Data already exists");
		} else {
			Questions n = Questions.builder()
					.title(user.getTitle())
					.content(user.getContent())
					.build();
			userRepository.save(n);
			return ResponseEntity.status(HttpStatus.OK).body("Data saved successfully");
		}
	}


}
