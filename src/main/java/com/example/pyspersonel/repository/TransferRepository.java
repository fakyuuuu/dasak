package com.example.pyspersonel.repository;

import com.example.pyspersonel.entity.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferRepository extends JpaRepository<Transfer, Integer> {
}
