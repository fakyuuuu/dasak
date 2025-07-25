package com.example.pyspersonel.controller;

import com.example.pyspersonel.entity.GbOnayDurumu;
import com.example.pyspersonel.service.GbOnayDurumuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gbonaydurumu")
public class GbOnayDurumuController {
    @Autowired
    private GbOnayDurumuService gbOnayDurumuService;

    @Autowired
    private com.example.pyspersonel.mapper.GbOnayDurumuMapper gbOnayDurumuMapper;

    @GetMapping
    public List<com.example.pyspersonel.dto.GbOnayDurumuDTO> getAll() {
        List<GbOnayDurumu> entities = gbOnayDurumuService.findAll();
        return entities.stream().map(gbOnayDurumuMapper::toDto).toList();
    }

    @GetMapping("/{id}")
    public com.example.pyspersonel.dto.GbOnayDurumuDTO getById(@PathVariable Integer id) {
        return gbOnayDurumuService.findById(id)
                .map(gbOnayDurumuMapper::toDto)
                .orElse(null);
    }

    @PostMapping
    public com.example.pyspersonel.dto.GbOnayDurumuDTO create(@RequestBody com.example.pyspersonel.dto.GbOnayDurumuDTO dto) {
        GbOnayDurumu entity = gbOnayDurumuMapper.toEntity(dto);
        GbOnayDurumu saved = gbOnayDurumuService.save(entity);
        return gbOnayDurumuMapper.toDto(saved);
    }

    @PutMapping("/{id}")
    public com.example.pyspersonel.dto.GbOnayDurumuDTO update(@PathVariable Integer id, @RequestBody com.example.pyspersonel.dto.GbOnayDurumuDTO dto) {
        GbOnayDurumu updated = gbOnayDurumuService.update(id, dto);
        return gbOnayDurumuMapper.toDto(updated);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        gbOnayDurumuService.deleteById(id);
    }
}
