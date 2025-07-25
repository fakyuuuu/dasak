package com.example.pyspersonel.service;

import com.example.pyspersonel.entity.Personel;
import com.example.pyspersonel.repository.PersonelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pyspersonel.mapper.PersonelMapper;

import java.util.List;
import java.util.Optional;

@Service
public class PersonelService {
    @Autowired
    private PersonelRepository personelRepository;

    @Autowired
    private PersonelMapper personelMapper;

    public List<Personel> findAll() {
        return personelRepository.findAll();
    }

    public Optional<Personel> findById(Integer id) {
        return personelRepository.findById(id);
    }

    public Personel save(Personel personel) {
        // Yeni kayıt eklerken ID null olmalı
        personel.setPersId(null);
        return personelRepository.save(personel);
    }

    public void deleteById(Integer id) {
        personelRepository.deleteById(id);
    }

    public Personel update(Integer id, com.example.pyspersonel.dto.PersonelDTO dto) {
        Personel entity = personelRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Personel not found"));
        entity.setPersId(id);
        personelMapper.updateEntityFromDto(dto, entity);
        return personelRepository.save(entity);
    }
}
