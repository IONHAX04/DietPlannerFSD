package com.ionhax.dietplanner.dietplanner.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ionhax.dietplanner.dietplanner.dto.UserDataDto;
import com.ionhax.dietplanner.dietplanner.service.UserDataService;


@Controller
@CrossOrigin(origins = "http://localhost:5173")
public class UserDataController {
    @Autowired
    private UserDataService userService;

    @PostMapping("/adduser")
    public ResponseEntity<String> addNewUser(@RequestBody UserDataDto user) {
        return userService.addUser(user);
    }

}
