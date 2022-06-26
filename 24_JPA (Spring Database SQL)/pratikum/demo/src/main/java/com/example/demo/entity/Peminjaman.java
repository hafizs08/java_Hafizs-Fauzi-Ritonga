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
@Table(name = "peminjaman")
public class Peminjaman {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPeminjaman;

    @Column(name = "tglPinjam")
    private String tglPinjam;

    @Column(name = "tglKembali")
    private String tglKembali;

    @Column(name = "judulBuku")
    private String judulBuku;

    @Column(name = "namaPinjam")
    private String namaPinjam;

    @Column(name = "petugas")
    private String petugas;

    @Column(name = "createdAt")
    private Date createdAt;

    @Column(name = "updatedAt")
    private Date updatedAt;




}
