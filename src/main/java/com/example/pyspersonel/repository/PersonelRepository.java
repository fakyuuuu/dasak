package com.example.pyspersonel.repository;

import com.example.pyspersonel.entity.Personel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonelRepository extends JpaRepository<Personel, Integer> {
}
