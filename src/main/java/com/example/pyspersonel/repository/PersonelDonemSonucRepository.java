package com.example.pyspersonel.repository;

import com.example.pyspersonel.entity.PersonelDonemSonuc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonelDonemSonucRepository extends JpaRepository<PersonelDonemSonuc, Integer> {
}
