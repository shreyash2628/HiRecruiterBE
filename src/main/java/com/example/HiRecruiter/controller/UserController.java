package com.example.HiRecruiter.controller;

import com.example.HiRecruiter.dto.CreateUserRequest;
import com.example.HiRecruiter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<String> createUser(
            @RequestBody CreateUserRequest request) {

        try {

            userService.createUser(request);

            return ResponseEntity.ok("User created successfully");

        } catch (Exception e) {

            return ResponseEntity.internalServerError()
                    .body(e.getMessage());

        }
    }

}