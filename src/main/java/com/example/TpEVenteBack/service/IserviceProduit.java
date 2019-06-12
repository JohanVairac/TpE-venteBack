package com.example.TpEVenteBack.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.example.TpEVenteBack.metier.Produit;

public interface IserviceProduit {
	
	public Produit saveProduit(Produit p);
	public List< Produit> listProduits();
	public  Produit getProduit(Long idProduit);
	public boolean deleteProduit (Long idProduit);
	public Produit updateProduit(Long idProduit,  Produit p);
	
	public void attribuerCategorie( Long idProduit,  Long idCatalogue);
	
	public List<Produit> produitCatalogue(long idCatalogue);


}
