package com.example.pyspersonel.service;

import com.example.pyspersonel.entity.PersonelDonemSonuc;
import com.example.pyspersonel.repository.PersonelDonemSonucRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonelDonemSonucService {
    @Autowired
    private PersonelDonemSonucRepository personelDonemSonucRepository;

    public List<PersonelDonemSonuc> findAll() {
        return personelDonemSonucRepository.findAll();
    }

    public Optional<PersonelDonemSonuc> findById(Integer id) {
        return personelDonemSonucRepository.findById(id);
    }

    public PersonelDonemSonuc save(PersonelDonemSonuc personelDonemSonuc) {
        return personelDonemSonucRepository.save(personelDonemSonuc);
    }

    public void deleteById(Integer id) {
        personelDonemSonucRepository.deleteById(id);
    }
}
