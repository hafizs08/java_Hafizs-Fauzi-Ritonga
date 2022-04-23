package com.example.demo.repository;

import java.util.List;

import javax.websocket.server.PathParam;

import com.example.demo.entity.Product;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productsRepo extends CrudRepository<Product, Long> {

    Product findByProductName(String name);
    
    //List<Product> findByCategory_CategoryNameIsContaining(String Name);

}
