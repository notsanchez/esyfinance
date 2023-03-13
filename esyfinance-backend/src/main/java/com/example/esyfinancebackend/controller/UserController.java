package com.example.esyfinancebackend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.esyfinancebackend.model.User;
import com.example.esyfinancebackend.repository.UserRepository;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    private boolean isNull(Object obj) {
        return obj == null;
    }

    @GetMapping("/api/v1/customer/user")
    List<User> getUsers(@RequestHeader("Authorization") String auth){

        if(isNull(auth)){
            return new ArrayList<>();
        } else {

            var users = userRepository.findAll();

            if(isNull(users)){
                return new ArrayList<>();
            } else {
                return users;
            }
        }
    }



    @GetMapping("/api/v1/customer/user-details")
    User getUserDetails(@RequestHeader("Authorization") String auth){

        if(isNull(auth)){
            return null;
        } else {
            var user = userRepository.userDetails(auth);

            if(isNull(user)){
                return null;
            } else {
                return user;
            }
        }

    }



}
