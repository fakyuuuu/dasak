package com.example.pyspersonel.service;

import com.example.pyspersonel.entity.GbOnayDurumu;
import com.example.pyspersonel.repository.GbOnayDurumuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pyspersonel.mapper.GbOnayDurumuMapper;

import java.util.List;
import java.util.Optional;

@Service
public class GbOnayDurumuService {
    @Autowired
    private GbOnayDurumuRepository gbOnayDurumuRepository;

    @Autowired
    private GbOnayDurumuMapper gbOnayDurumuMapper;

    public List<GbOnayDurumu> findAll() {
        return gbOnayDurumuRepository.findAll();
    }

    public Optional<GbOnayDurumu> findById(Integer id) {
        return gbOnayDurumuRepository.findById(id);
    }

    public GbOnayDurumu save(GbOnayDurumu gbOnayDurumu) {
        return gbOnayDurumuRepository.save(gbOnayDurumu);
    }

    public GbOnayDurumu update(Integer id, com.example.pyspersonel.dto.GbOnayDurumuDTO dto) {
        GbOnayDurumu entity = gbOnayDurumuRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("GbOnayDurumu not found"));
        entity.setKayitId(id);
        gbOnayDurumuMapper.updateEntityFromDto(dto, entity);
        return gbOnayDurumuRepository.save(entity);
    }

    public void deleteById(Integer id) {
        gbOnayDurumuRepository.deleteById(id);
    }
}
