package com.example.demo.entity;

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
@Table(name = "petugas")
public class Petugas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPetugas;

    @Column(name = "password")
    private String password;

    @Column(name = "nama")
    private String nama;

    @Column(name = "role")
    private String role;
    

}
