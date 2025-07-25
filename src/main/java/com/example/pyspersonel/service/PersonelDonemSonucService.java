package com.example.pyspersonel.service;

import com.example.pyspersonel.entity.PersonelDonemSonuc;
import com.example.pyspersonel.repository.PersonelDonemSonucRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pyspersonel.mapper.PersonelDonemSonucMapper;

import java.util.List;
import java.util.Optional;

@Service
public class PersonelDonemSonucService {
    @Autowired
    private PersonelDonemSonucRepository personelDonemSonucRepository;

    @Autowired
    private PersonelDonemSonucMapper personelDonemSonucMapper;

    public List<PersonelDonemSonuc> findAll() {
        return personelDonemSonucRepository.findAll();
    }

    public Optional<PersonelDonemSonuc> findById(Integer id) {
        return personelDonemSonucRepository.findById(id);
    }

    public PersonelDonemSonuc save(PersonelDonemSonuc personelDonemSonuc) {
        return personelDonemSonucRepository.save(personelDonemSonuc);
    }

    public PersonelDonemSonuc update(Integer id, com.example.pyspersonel.dto.PersonelDonemSonucDTO dto) {
        PersonelDonemSonuc entity = personelDonemSonucRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("PersonelDonemSonuc not found"));
        entity.setSonucId(id);
        personelDonemSonucMapper.updateEntityFromDto(dto, entity);
        return personelDonemSonucRepository.save(entity);
    }

    public void deleteById(Integer id) {
        personelDonemSonucRepository.deleteById(id);
    }
}
