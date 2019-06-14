package com.example.TpEVenteBack.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.TpEVenteBack.metier.Promotion;


public interface PromotionRepository extends JpaRepository< Promotion,Long> {
	@Modifying(clearAutomatically = true)// forcer la mise à jour de bdd
	@Transactional
	@Query("update Promotion p SET p.produit.idProduit = :x where p.idPromo= :y")
	public void attribuerProduit(@Param("y") long idPromo, @Param("x") long idProduit);
	
//	@Modifying(clearAutomatically = true)// forcer la mise à jour de bdd
//	@Transactional
//	@Query("select p.*, prod.nomProduit from Promotion p inner join Produit prod on prod.idProduit = p.produit.idProduit")
//	public void GetAllPromotions();
	



}
