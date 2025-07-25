package com.example.pyspersonel.service;

import com.example.pyspersonel.entity.Personel;
import com.example.pyspersonel.repository.PersonelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonelService {
    @Autowired
    private PersonelRepository personelRepository;

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
        // DTO'dan gelen ID'yi mevcut entity'ye set et
        entity.setPersId(id);
        // DTO'daki verileri mevcut entity'ye aktar
        entity.setAd(dto.getAd());
        entity.setSoyad(dto.getSoyad());
        entity.setKimlikNo(dto.getKimlikNo());
        entity.setEmail(dto.getEmail());
        entity.setTelIs(dto.getTelIs());
        entity.setCalTip(dto.getCalTip());
        entity.setIsGirTarih(dto.getIsGirTarih());
        entity.setAmirEh(dto.getAmirEh());
        entity.setIsKod(dto.getIsKod());
        entity.setIsAd(dto.getIsAd());
        entity.setPozisyonKod(dto.getPozisyonKod());
        entity.setPozisyonAd(dto.getPozisyonAd());
        entity.setPerOrgKod(dto.getPerOrgKod());
        entity.setPerOrgAd(dto.getPerOrgAd());
        entity.setUniteOrgKod(dto.getUniteOrgKod());
        entity.setUniteOrgAd(dto.getUniteOrgAd());
        entity.setSeviyeKod(dto.getSeviyeKod());
        entity.setGmKod(dto.getGmKod());
        entity.setGmAd(dto.getGmAd());
        entity.setGmyKod(dto.getGmyKod());
        entity.setGmyAd(dto.getGmyAd());
        entity.setGrpbasKod(dto.getGrpbasKod());
        entity.setGrpbasAd(dto.getGrpbasAd());
        entity.setDirKod(dto.getDirKod());
        entity.setDirAd(dto.getDirAd());
        entity.setMdrKod(dto.getMdrKod());
        entity.setMdrAd(dto.getMdrAd());
        entity.setMdryrdKod(dto.getMdryrdKod());
        entity.setMdryrdAd(dto.getMdryrdAd());
        entity.setBassefKod(dto.getBassefKod());
        entity.setBassefAd(dto.getBassefAd());
        entity.setAmirlikKod(dto.getAmirlikKod());
        entity.setAmirlikAd(dto.getAmirlikAd());
        entity.setPbforKod(dto.getPbforKod());
        entity.setPbforAd(dto.getPbforAd());
        entity.setDonemNo(dto.getDonemNo());
        entity.setPerNo(dto.getPerNo());
        entity.setOper(dto.getOper());
        entity.setOperSaat(dto.getOperSaat());
        entity.setCalgrupKod(dto.getCalgrupKod());
        entity.setCalgrupAd(dto.getCalgrupAd());
        // Diğer alanlar eksikse ekleyin
        return personelRepository.save(entity);
    }
}
