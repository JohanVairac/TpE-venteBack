package com.example.TpEVenteBack.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TpEVenteBack.metier.EtatDeLaCommande;



public interface EtatDeLaCommandeRepository extends JpaRepository< EtatDeLaCommande,Long>{

}
