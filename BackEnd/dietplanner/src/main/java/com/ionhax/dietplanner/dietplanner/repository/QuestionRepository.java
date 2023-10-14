package com.ionhax.dietplanner.dietplanner.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ionhax.dietplanner.dietplanner.entity.Questions;

public interface QuestionRepository extends CrudRepository<Questions, String>{
    Optional<Questions> findByTitle(String title);
}
