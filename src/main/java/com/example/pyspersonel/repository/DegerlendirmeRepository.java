package com.example.pyspersonel.repository;

import com.example.pyspersonel.entity.Degerlendirme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DegerlendirmeRepository extends JpaRepository<Degerlendirme, Integer> {
}
