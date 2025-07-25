package com.example.pyspersonel.repository;

import com.example.pyspersonel.entity.GbOnayDurumu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GbOnayDurumuRepository extends JpaRepository<GbOnayDurumu, Integer> {
}
