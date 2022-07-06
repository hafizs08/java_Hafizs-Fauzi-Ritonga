package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "transaction_details")
public class TransactionDetail {
    @Id
    private String id;
    private String transaction_id;
    private String product_id;
    private String quantity;


    
}
