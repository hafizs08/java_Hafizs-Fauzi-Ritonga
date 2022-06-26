package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Denda")
public class Denda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDenda;

    @Column(name = "namaDenda")
    private String namaDenda;

    @Column(name = "jenisDenda")
    private String jenisDenda;

    @Column(name = "hargaDenda")
    private int hargaDenda;

    @Column(name = "createdAt")
    private Date createdAt;

    @Column(name = "updatedAt")
    private Date updatedAt;

    


    
}
