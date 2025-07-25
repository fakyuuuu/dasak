package com.example.pyspersonel.service;

import com.example.pyspersonel.entity.Degerlendirme;
import com.example.pyspersonel.repository.DegerlendirmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DegerlendirmeService {
    @Autowired
    private DegerlendirmeRepository degerlendirmeRepository;

    public List<Degerlendirme> findAll() {
        return degerlendirmeRepository.findAll();
    }

    public Optional<Degerlendirme> findById(Integer id) {
        return degerlendirmeRepository.findById(id);
    }

    public Degerlendirme save(Degerlendirme degerlendirme) {
        return degerlendirmeRepository.save(degerlendirme);
    }

    public void deleteById(Integer id) {
        degerlendirmeRepository.deleteById(id);
    }
}
