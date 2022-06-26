package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.TransactionDetail;

public interface TransactionDetailRepository extends MongoRepository<TransactionDetail, String> {

}
    

