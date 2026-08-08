package com.example.HiRecruiter.service;

import com.example.HiRecruiter.entities.User;
import com.example.HiRecruiter.dto.CreateUserRequest;
import com.example.HiRecruiter.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void createUser(CreateUserRequest request) throws Exception {

        User user = new User();

        user.setUid(request.getUid());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        user.setPhoneNumber(request.getPhoneNumber());

        // Default values
        user.setPlan("FREE");
        user.setCreatedAt(Instant.now().toString());

        userRepository.save(user);
    }
}