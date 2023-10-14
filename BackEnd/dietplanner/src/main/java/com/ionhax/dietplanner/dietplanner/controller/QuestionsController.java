package com.ionhax.dietplanner.dietplanner.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ionhax.dietplanner.dietplanner.dto.QuestionsDto;
import com.ionhax.dietplanner.dietplanner.service.QuestionService;


@Controller
@CrossOrigin(origins = "http://localhost:5173")

public class QuestionsController {

    @Autowired
    private QuestionService userService;

    @PostMapping("/addQuestions")
    public ResponseEntity<String> addNewUser(@RequestBody QuestionsDto user) {
        return userService.addUser(user);
    }
    
}
