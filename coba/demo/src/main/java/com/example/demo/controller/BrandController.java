package com.example.demo.controller;

import com.example.demo.repository.brandRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

public class BrandController {
    @Autowired
    private brandRepo productRepository;

    
}
