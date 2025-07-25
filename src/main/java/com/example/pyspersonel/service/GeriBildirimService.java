package com.example.pyspersonel.service;

import com.example.pyspersonel.entity.GeriBildirim;
import com.example.pyspersonel.repository.GeriBildirimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pyspersonel.mapper.GeriBildirimMapper;

import java.util.List;
import java.util.Optional;

@Service
public class GeriBildirimService {
    @Autowired
    private GeriBildirimRepository geriBildirimRepository;

    @Autowired
    private GeriBildirimMapper geriBildirimMapper;

    public List<GeriBildirim> findAll() {
        return geriBildirimRepository.findAll();
    }

    public Optional<GeriBildirim> findById(Integer id) {
        return geriBildirimRepository.findById(id);
    }

    public GeriBildirim save(GeriBildirim geriBildirim) {
        return geriBildirimRepository.save(geriBildirim);
    }

    public GeriBildirim update(Integer id, com.example.pyspersonel.dto.GeriBildirimDTO dto) {
        GeriBildirim entity = geriBildirimRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("GeriBildirim not found"));
        entity.setGbId(id);
        geriBildirimMapper.updateEntityFromDto(dto, entity);
        return geriBildirimRepository.save(entity);
    }

    public void deleteById(Integer id) {
        geriBildirimRepository.deleteById(id);
    }
}
