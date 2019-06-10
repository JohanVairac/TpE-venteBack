package com.example.TpEVenteBack.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TpEVenteBack.metier.Catalogue;

public interface CatalogueRepository extends JpaRepository<Catalogue, Long>{

}
