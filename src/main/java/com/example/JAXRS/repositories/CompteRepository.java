package com.example.JAXRS.repositories;

import com.example.JAXRS.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}
