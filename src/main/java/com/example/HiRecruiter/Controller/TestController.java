package com.example.HiRecruiter.Controller;

import com.google.cloud.firestore.Firestore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private Firestore firestore;

    @GetMapping("/test")
    public String test() throws Exception {

        firestore.collection("test")
                .document("first")
                .set(Map.of("message", "Hello Firestore"));

        return "Connected to Firestore!";
    }
}
