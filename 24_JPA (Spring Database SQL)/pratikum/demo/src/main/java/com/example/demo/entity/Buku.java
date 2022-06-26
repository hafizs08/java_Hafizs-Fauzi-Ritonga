package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Buku {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBuku;

    @Column(name = "judul")
    private String judul;

    @Column(name = "pengarang")
    private String pengarang;

    @Column(name = "penerbit")
    private String penerbit;

    @Column(name = "kategori" )
    private String kategori;

    @Column(name = "tahun")
    private Integer tahun;

    @Column(name = "createdAt")
    private Date createdAt;

    @Column(name = "updatedAt")
    private Date updatedAt;





}
