package com.domain.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/message")
public class welcomeContoller {
        @GetMapping
        public String get() {
            return "Welcome to Spring Boot";
        

    }
    @PostMapping
        public String post() {
            return "Welcome to Spring Boot";
        

    }
    @DeleteMapping
        public String delete() {
            return "Welcome to Spring Boot";
        

    }
}
