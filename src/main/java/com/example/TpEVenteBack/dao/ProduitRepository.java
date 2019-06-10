package com.example.TpEVenteBack.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TpEVenteBack.metier.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
