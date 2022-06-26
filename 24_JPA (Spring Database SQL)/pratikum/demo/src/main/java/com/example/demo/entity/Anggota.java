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
@Table(name = "anggota")
public class Anggota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAnggota;

    @Column(name = "nama")
    private String nama;

    @Column(name = "jenisKelamin")
    private String jenisKelamin;

    @Column(name = "alamat")
    private String alamat;

    @Column(name = "status")
    private String status;

    @Column(name = "noTelp")
    private String noTelp;
 
    


  
    
    
}
