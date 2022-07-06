package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Transaction;

public interface TransactionService {

        Transaction create(Transaction transaction);
        
        List<Transaction> findAll();
        
        Transaction findById(String id);

        Transaction update(String id, Transaction transaction);
    
        void delete(String id);
}
