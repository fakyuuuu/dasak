package com.example.pyspersonel.service;

import com.example.pyspersonel.entity.Transfer;
import com.example.pyspersonel.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransferService {
    @Autowired
    private TransferRepository transferRepository;

    public List<Transfer> findAll() {
        return transferRepository.findAll();
    }

    public Optional<Transfer> findById(Integer id) {
        return transferRepository.findById(id);
    }

    public Transfer save(Transfer transfer) {
        return transferRepository.save(transfer);
    }

    public void deleteById(Integer id) {
        transferRepository.deleteById(id);
    }
}
