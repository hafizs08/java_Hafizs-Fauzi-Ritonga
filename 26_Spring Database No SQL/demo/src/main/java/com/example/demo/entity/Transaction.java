package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "transactions")
public class Transaction {
    @Id
    private String id;
    private String cumstomer_name;
    private String is_paid;
    private String created_at;
    
}
