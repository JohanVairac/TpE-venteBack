package com.example.TpEVenteBack.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TpEVenteBack.metier.MoyenDePaiment;

public interface MoyenDePaimentRepository extends JpaRepository<MoyenDePaiment, Long>{

}
