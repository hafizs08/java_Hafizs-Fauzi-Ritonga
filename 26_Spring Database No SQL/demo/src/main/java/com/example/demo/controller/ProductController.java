package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Product product) {
        Product productCreated = productService.create(product);
        return ResponseEntity.ok(productCreated);
    }
    @GetMapping
    public ResponseEntity<?> findAll() {
        List<Product> products = productService.findAll();
        return ResponseEntity.ok(products);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> product(@PathVariable("id") String id) {
        try{
            Product product = productService.findById(id);
            return ResponseEntity.ok(product);
        }catch(Exception e){
            InternalError error = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(error);
        }
    }
    @PatchMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") String id, @RequestBody Product product) {
        try{
            Product productUpdated = productService.update(id, product);
            return ResponseEntity.ok(productUpdated);
        }catch(Exception e){
            InternalError error = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(error);
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") String id) {
        try{
            productService.delete(id);
            return ResponseEntity.ok().build();
        }catch(Exception e){
            InternalError error = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(error);
        }
    }

}
