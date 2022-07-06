package com.example.demo.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;

@Service

public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(String id) {
        return productRepository.findById(id).get();
    }

    @Override
    public Product update(String id, Product product) {
        Product productById = this.findById(id);
        productById.setName(product.getName());
        productById.setDescription(product.getDescription());
        return productRepository.save(productById);
    }

    @Override
    public void delete(String id) {
        Product productById = this.findById(id);
        productRepository.delete(productById);
    }

}
    

