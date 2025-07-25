package com.example.pyspersonel.service;

import com.example.pyspersonel.entity.PersonelDonem;
import com.example.pyspersonel.repository.PersonelDonemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonelDonemService {
    @Autowired
    private PersonelDonemRepository personelDonemRepository;

    public List<PersonelDonem> findAll() {
        return personelDonemRepository.findAll();
    }

    public Optional<PersonelDonem> findById(Integer id) {
        return personelDonemRepository.findById(id);
    }

    public PersonelDonem save(PersonelDonem personelDonem) {
        return personelDonemRepository.save(personelDonem);
    }

    public void deleteById(Integer id) {
        personelDonemRepository.deleteById(id);
    }
}
