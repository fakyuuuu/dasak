package com.example.pyspersonel.service;

import com.example.pyspersonel.entity.Transfer;
import com.example.pyspersonel.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pyspersonel.mapper.TransferMapper;

import java.util.List;
import java.util.Optional;

@Service
public class TransferService {
    @Autowired
    private TransferRepository transferRepository;

    @Autowired
    private TransferMapper transferMapper;

    public List<Transfer> findAll() {
        return transferRepository.findAll();
    }

    public Optional<Transfer> findById(Integer id) {
        return transferRepository.findById(id);
    }

    public Transfer save(Transfer transfer) {
        return transferRepository.save(transfer);
    }

    public Transfer update(Integer id, com.example.pyspersonel.dto.TransferDTO dto) {
        Transfer entity = transferRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Transfer not found"));
        entity.setTransferId(id);
        transferMapper.updateEntityFromDto(dto, entity);
        return transferRepository.save(entity);
    }

    public void deleteById(Integer id) {
        transferRepository.deleteById(id);
    }
}
