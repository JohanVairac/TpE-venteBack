package com.example.TpEVenteBack.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.TpEVenteBack.metier.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{
	
	@Modifying(clearAutomatically = true)// forcer la mise à jour de bdd
	@Transactional
	@Query("update Produit p SET p.catalogue.idCatalogue = :x where p.idProduit = :y")
	public void attribuerCategorie(@Param("y") long idProduit, @Param("x") long idCatalogue);
	
	
	@Query("select p from Produit p where p.catalogue.idCatalogue like :x")
	public List<Produit> produitCatalogue(@Param("x")long idCatalogue);

}
