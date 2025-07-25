package com.example.pyspersonel.service;

import com.example.pyspersonel.entity.GeriBildirim;
import com.example.pyspersonel.repository.GeriBildirimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GeriBildirimService {
    @Autowired
    private GeriBildirimRepository geriBildirimRepository;

    public List<GeriBildirim> findAll() {
        return geriBildirimRepository.findAll();
    }

    public Optional<GeriBildirim> findById(Integer id) {
        return geriBildirimRepository.findById(id);
    }

    public GeriBildirim save(GeriBildirim geriBildirim) {
        return geriBildirimRepository.save(geriBildirim);
    }

    public void deleteById(Integer id) {
        geriBildirimRepository.deleteById(id);
    }
}
