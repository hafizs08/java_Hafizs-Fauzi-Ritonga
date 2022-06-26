package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Transaction;
import com.example.demo.repository.TransactionRepository;
import com.example.demo.service.TransactionService;

public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionRepository  transactionRepository;

    @Override
    public Transaction create(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
    @Override
    public List<Transaction> findAll() {
        return transactionRepository.findAll();
    }
    @Override
    public Transaction findById(String id) {
        return transactionRepository.findById(id).get();
    }
    @Override
    public Transaction update(String id, Transaction transaction) {
        Transaction transactionById = this.findById(id);
        transactionById.setCumstomer_name(transaction.getCumstomer_name());
        transactionById.setIs_paid(transaction.getIs_paid());
        transactionById.setCreated_at(transaction.getCreated_at());
        return transactionRepository.save(transactionById);
    }
    @Override
    public void delete(String id) {
        Transaction transactionById = this.findById(id);
        transactionRepository.delete(transactionById);
    }

}
    

