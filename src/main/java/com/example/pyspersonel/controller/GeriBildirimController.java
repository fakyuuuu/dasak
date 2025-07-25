package com.example.pyspersonel.controller;

import com.example.pyspersonel.entity.GeriBildirim;
import com.example.pyspersonel.service.GeriBildirimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/geribildirim")
public class GeriBildirimController {
    @Autowired
    private GeriBildirimService geriBildirimService;

    @Autowired
    private com.example.pyspersonel.mapper.GeriBildirimMapper geriBildirimMapper;

    @GetMapping
    public List<com.example.pyspersonel.dto.GeriBildirimDTO> getAll() {
        List<GeriBildirim> entities = geriBildirimService.findAll();
        return entities.stream().map(geriBildirimMapper::toDto).toList();
    }

    @GetMapping("/{id}")
    public com.example.pyspersonel.dto.GeriBildirimDTO getById(@PathVariable Integer id) {
        return geriBildirimService.findById(id)
                .map(geriBildirimMapper::toDto)
                .orElse(null);
    }

    @PostMapping
    public com.example.pyspersonel.dto.GeriBildirimDTO create(@RequestBody com.example.pyspersonel.dto.GeriBildirimDTO dto) {
        GeriBildirim entity = geriBildirimMapper.toEntity(dto);
        GeriBildirim saved = geriBildirimService.save(entity);
        return geriBildirimMapper.toDto(saved);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        geriBildirimService.deleteById(id);
    }
}
