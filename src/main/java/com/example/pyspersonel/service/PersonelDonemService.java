package com.example.pyspersonel.service;

import com.example.pyspersonel.entity.PersonelDonem;
import com.example.pyspersonel.repository.PersonelDonemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pyspersonel.mapper.PersonelDonemMapper;

import java.util.List;
import java.util.Optional;

@Service
public class PersonelDonemService {
    @Autowired
    private PersonelDonemRepository personelDonemRepository;

    @Autowired
    private PersonelDonemMapper personelDonemMapper;

    public List<PersonelDonem> findAll() {
        return personelDonemRepository.findAll();
    }

    public Optional<PersonelDonem> findById(Integer id) {
        return personelDonemRepository.findById(id);
    }

    public PersonelDonem save(PersonelDonem personelDonem) {
        return personelDonemRepository.save(personelDonem);
    }

    public PersonelDonem update(Integer id, com.example.pyspersonel.dto.PersonelDonemDTO dto) {
        PersonelDonem entity = personelDonemRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("PersonelDonem not found"));
        entity.setPersDonemId(id);
        personelDonemMapper.updateEntityFromDto(dto, entity);
        return personelDonemRepository.save(entity);
    }

    public void deleteById(Integer id) {
        personelDonemRepository.deleteById(id);
    }
}
