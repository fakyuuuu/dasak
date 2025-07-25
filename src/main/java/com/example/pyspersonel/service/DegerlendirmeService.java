package com.example.pyspersonel.service;

import com.example.pyspersonel.entity.Degerlendirme;
import com.example.pyspersonel.repository.DegerlendirmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pyspersonel.mapper.DegerlendirmeMapper;

import java.util.List;
import java.util.Optional;

@Service
public class DegerlendirmeService {
    @Autowired
    private DegerlendirmeRepository degerlendirmeRepository;

    @Autowired
    private DegerlendirmeMapper degerlendirmeMapper;

    public List<Degerlendirme> findAll() {
        return degerlendirmeRepository.findAll();
    }

    public Optional<Degerlendirme> findById(Integer id) {
        return degerlendirmeRepository.findById(id);
    }

    public Degerlendirme save(Degerlendirme degerlendirme) {
        return degerlendirmeRepository.save(degerlendirme);
    }

    public Degerlendirme update(Integer id, com.example.pyspersonel.dto.DegerlendirmeDTO dto) {
        Degerlendirme entity = degerlendirmeRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Degerlendirme not found"));
        entity.setDegNo(id);
        degerlendirmeMapper.updateEntityFromDto(dto, entity);
        return degerlendirmeRepository.save(entity);
    }

    public void deleteById(Integer id) {
        degerlendirmeRepository.deleteById(id);
    }
}
