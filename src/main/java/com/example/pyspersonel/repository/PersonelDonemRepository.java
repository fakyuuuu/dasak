package com.example.pyspersonel.repository;

import com.example.pyspersonel.entity.PersonelDonem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonelDonemRepository extends JpaRepository<PersonelDonem, Integer> {
}
