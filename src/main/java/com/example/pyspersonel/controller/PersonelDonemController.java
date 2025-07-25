package com.example.pyspersonel.controller;

import com.example.pyspersonel.entity.PersonelDonem;
import com.example.pyspersonel.service.PersonelDonemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personeldonem")
public class PersonelDonemController {
    @Autowired
    private PersonelDonemService personelDonemService;

    @Autowired
    private com.example.pyspersonel.mapper.PersonelDonemMapper personelDonemMapper;

    @GetMapping
    public List<com.example.pyspersonel.dto.PersonelDonemDTO> getAll() {
        List<PersonelDonem> entities = personelDonemService.findAll();
        return entities.stream().map(personelDonemMapper::toDto).toList();
    }

    @GetMapping("/{id}")
    public com.example.pyspersonel.dto.PersonelDonemDTO getById(@PathVariable Integer id) {
        return personelDonemService.findById(id)
                .map(personelDonemMapper::toDto)
                .orElse(null);
    }

    @PostMapping
    public com.example.pyspersonel.dto.PersonelDonemDTO create(@RequestBody com.example.pyspersonel.dto.PersonelDonemDTO dto) {
        PersonelDonem entity = personelDonemMapper.toEntity(dto);
        PersonelDonem saved = personelDonemService.save(entity);
        return personelDonemMapper.toDto(saved);
    }

    @PutMapping("/{id}")
    public com.example.pyspersonel.dto.PersonelDonemDTO update(@PathVariable Integer id, @RequestBody com.example.pyspersonel.dto.PersonelDonemDTO dto) {
        PersonelDonem updated = personelDonemService.update(id, dto);
        return personelDonemMapper.toDto(updated);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        personelDonemService.deleteById(id);
    }
}
