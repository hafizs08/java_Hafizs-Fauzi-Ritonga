package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.repository.productsRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api")
public class ProductsContoller {
    @Autowired
    private productsRepo productRepository;

    @PostMapping("/products")
    public Product createNewProduct(@RequestBody Product payload) {
        System.out.println("payload: " + payload.getProductId());
        System.out.println("payload: " + payload);
        return productRepository.save(payload);
    }

    @PostMapping("/search/name")
    public Product findByProductName(String name) {
        return productRepository.findByProductName(name);
    }
}
