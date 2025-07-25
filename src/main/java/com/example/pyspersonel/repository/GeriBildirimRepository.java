package com.example.pyspersonel.repository;

import com.example.pyspersonel.entity.GeriBildirim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeriBildirimRepository extends JpaRepository<GeriBildirim, Integer> {
}
