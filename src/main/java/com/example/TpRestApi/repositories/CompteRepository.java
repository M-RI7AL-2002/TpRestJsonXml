package com.example.TpRestApi.repositories;


import com.example.TpRestApi.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}
