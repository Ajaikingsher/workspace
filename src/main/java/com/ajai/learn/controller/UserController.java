package com.ajai.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ajai.learn.model.User;
import com.ajai.learn.service.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/save")
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        User newUser = userService.createUser(user);
        return  ResponseEntity.status(201).body(newUser);
    }
    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUser() {
        List<User> users = userService.getAllUser();
        return ResponseEntity.status(200).body(users);
    }
    
}
