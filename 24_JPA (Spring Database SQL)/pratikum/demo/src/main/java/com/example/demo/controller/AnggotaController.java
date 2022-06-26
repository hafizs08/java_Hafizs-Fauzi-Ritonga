package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Anggota;
import com.example.demo.repository.AnggotaRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api")
public class AnggotaController {
    @Autowired
    private AnggotaRepo anggotaRepo;

    @GetMapping("/anggota")
    public List<Anggota> getAnggota() {
        return anggotaRepo.findAll();
    }
    @GetMapping("/anggota/{id}")
    public Optional <Anggota> getAnggota(@PathVariable Long id) {
        return anggotaRepo.findById(id);
    }
    @PostMapping("/anggota")
    public Anggota createNewAnggota(@RequestBody Anggota payload) {
        return anggotaRepo.save(payload);
    }
}
