package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name = "Category")
@Getter
@Setter
public @Data class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;



    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private int price;

    @Column(name = "stock")
    private int stock;

    
}
