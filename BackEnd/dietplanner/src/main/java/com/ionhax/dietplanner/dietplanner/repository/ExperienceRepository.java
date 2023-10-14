package com.ionhax.dietplanner.dietplanner.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

import com.ionhax.dietplanner.dietplanner.entity.Experience;

public interface ExperienceRepository extends CrudRepository<Experience, String>{
    Optional<Experience> findByTitle(String title);    
}
