package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductService {
    Product create(Product product);

    List<Product> findAll();

    Product findById(String id);

    Product update(String id, Product product);
    
    void delete(String id);
}
