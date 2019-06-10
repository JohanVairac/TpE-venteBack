package com.example.TpEVenteBack.service;

import java.util.List;

import com.example.TpEVenteBack.metier.Produit;

public interface InterfaceProduit {
	
	public Produit saveProduit(Produit p);
	public List< Produit> listProduits();
	public  Produit getProduit(Long idProduit);
	public boolean deleteProduit (Long idProduit);
	public Produit updateProduit(Long idProduit,  Produit p);


}
