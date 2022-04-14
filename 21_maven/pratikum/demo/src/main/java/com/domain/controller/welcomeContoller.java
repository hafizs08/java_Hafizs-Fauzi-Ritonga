package com.domain.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class welcomeContoller {
  

        @GetMapping
        public String welcome() {
            return "Welcome to Spring Boot";
        

    }
}
