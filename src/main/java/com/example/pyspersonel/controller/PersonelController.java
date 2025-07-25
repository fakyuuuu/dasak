package com.example.pyspersonel.controller;

import com.example.pyspersonel.entity.Personel;
import com.example.pyspersonel.service.PersonelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personel")
public class PersonelController {
    @Autowired
    private PersonelService personelService;

    @Autowired
    private com.example.pyspersonel.mapper.PersonelMapper personelMapper;

    @GetMapping
    public List<com.example.pyspersonel.dto.PersonelDTO> getAll() {
        List<Personel> entities = personelService.findAll();
        return entities.stream().map(personelMapper::toDto).toList();
    }

    @GetMapping("/{id}")
    public com.example.pyspersonel.dto.PersonelDTO getById(@PathVariable Integer id) {
        return personelService.findById(id)
                .map(personelMapper::toDto)
                .orElse(null);
    }

    @PostMapping
    public com.example.pyspersonel.dto.PersonelDTO create(@RequestBody com.example.pyspersonel.dto.PersonelDTO dto) {
        Personel entity = personelMapper.toEntity(dto);
        Personel saved = personelService.save(entity);
        return personelMapper.toDto(saved);
    }

    @PutMapping("/{id}")
    public com.example.pyspersonel.dto.PersonelDTO update(@PathVariable Integer id, @RequestBody com.example.pyspersonel.dto.PersonelDTO dto) {
        Personel updated = personelService.update(id, dto);
        return personelMapper.toDto(updated);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        personelService.deleteById(id);
    }
}
