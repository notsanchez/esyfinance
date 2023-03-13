package com.example.esyfinancebackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.esyfinancebackend.model.User;
import com.example.esyfinancebackend.repository.UserRepository;

@RestController("/api/v1")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/create-user")
    User newUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

}
