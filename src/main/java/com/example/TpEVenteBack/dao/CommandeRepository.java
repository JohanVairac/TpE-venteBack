package com.example.TpEVenteBack.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TpEVenteBack.metier.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long>{

}
