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

import com.example.demo.entity.Transaction;
import com.example.demo.service.TransactionService;

@RestController
@RequestMapping("/Transaction")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Transaction transaction) {
        Transaction transactionCreated = transactionService.create(transaction);
        return ResponseEntity.ok(transactionCreated);
    }
    @GetMapping
    public ResponseEntity<?> findAll() {
        List<Transaction> transactions = transactionService.findAll();
        return ResponseEntity.ok(transactions);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> transaction(@PathVariable("id") String id) {
        try{
            Transaction transaction = transactionService.findById(id);
            return ResponseEntity.ok(transaction);
        }catch(Exception e){
            InternalError error = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(error);
        }
    }
    @PatchMapping
    public ResponseEntity<?> update(@PathVariable("id") String id, @RequestBody Transaction transaction) {
        try{
            Transaction transactionUpdated = transactionService.update(id,transaction);
            return ResponseEntity.ok(transactionUpdated);
        }catch(Exception e){
            InternalError error = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(error);
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") String id) {
        try{
            transactionService.delete(id);
            return ResponseEntity.ok().build();
        }catch(Exception e){
            InternalError error = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(error);
        }
    }
}
