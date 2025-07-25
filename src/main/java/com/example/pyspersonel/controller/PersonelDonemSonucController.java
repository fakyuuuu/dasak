package com.example.pyspersonel.controller;

import com.example.pyspersonel.entity.PersonelDonemSonuc;
import com.example.pyspersonel.service.PersonelDonemSonucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personeldonemsonuc")
public class PersonelDonemSonucController {
    @Autowired
    private PersonelDonemSonucService personelDonemSonucService;

    @Autowired
    private com.example.pyspersonel.mapper.PersonelDonemSonucMapper personelDonemSonucMapper;

    @GetMapping
    public List<com.example.pyspersonel.dto.PersonelDonemSonucDTO> getAll() {
        List<PersonelDonemSonuc> entities = personelDonemSonucService.findAll();
        return entities.stream().map(personelDonemSonucMapper::toDto).toList();
    }

    @GetMapping("/{id}")
    public com.example.pyspersonel.dto.PersonelDonemSonucDTO getById(@PathVariable Integer id) {
        return personelDonemSonucService.findById(id)
                .map(personelDonemSonucMapper::toDto)
                .orElse(null);
    }

    @PostMapping
    public com.example.pyspersonel.dto.PersonelDonemSonucDTO create(@RequestBody com.example.pyspersonel.dto.PersonelDonemSonucDTO dto) {
        PersonelDonemSonuc entity = personelDonemSonucMapper.toEntity(dto);
        PersonelDonemSonuc saved = personelDonemSonucService.save(entity);
        return personelDonemSonucMapper.toDto(saved);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        personelDonemSonucService.deleteById(id);
    }
}
