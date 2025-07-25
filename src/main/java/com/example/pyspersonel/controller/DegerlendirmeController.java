package com.example.pyspersonel.controller;

import com.example.pyspersonel.entity.Degerlendirme;
import com.example.pyspersonel.service.DegerlendirmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/degerlendirme")
public class DegerlendirmeController {
    @Autowired
    private DegerlendirmeService degerlendirmeService;

    @Autowired
    private com.example.pyspersonel.mapper.DegerlendirmeMapper degerlendirmeMapper;

    @GetMapping
    public List<com.example.pyspersonel.dto.DegerlendirmeDTO> getAll() {
        List<Degerlendirme> entities = degerlendirmeService.findAll();
        return entities.stream().map(degerlendirmeMapper::toDto).toList();
    }

    @GetMapping("/{id}")
    public com.example.pyspersonel.dto.DegerlendirmeDTO getById(@PathVariable Integer id) {
        return degerlendirmeService.findById(id)
                .map(degerlendirmeMapper::toDto)
                .orElse(null);
    }

    @PostMapping
    public com.example.pyspersonel.dto.DegerlendirmeDTO create(@RequestBody com.example.pyspersonel.dto.DegerlendirmeDTO dto) {
        Degerlendirme entity = degerlendirmeMapper.toEntity(dto);
        Degerlendirme saved = degerlendirmeService.save(entity);
        return degerlendirmeMapper.toDto(saved);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        degerlendirmeService.deleteById(id);
    }
}
