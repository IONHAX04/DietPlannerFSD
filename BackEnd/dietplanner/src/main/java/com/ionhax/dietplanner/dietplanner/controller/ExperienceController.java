package com.ionhax.dietplanner.dietplanner.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ionhax.dietplanner.dietplanner.dto.ExperienceDto;
import com.ionhax.dietplanner.dietplanner.service.ExperienceService;


@Controller
@CrossOrigin(origins = "http://localhost:5173")


public class ExperienceController {
    @Autowired
    private ExperienceService experienceService;

    @PostMapping("/addExperience")
    public ResponseEntity<String> addNewUser(@RequestBody ExperienceDto user){
        return experienceService.addUser(user);
    }
    
}
