package com.example.demo.services;

import javax.transaction.Transactional;

import com.example.demo.entity.Product;
import com.example.demo.repository.productsRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class productServices {
    @Autowired
    private productsRepo productRepository;

    public Product findByProductName(String name) {
        return productRepository.findByProductName(name);
    }
}
