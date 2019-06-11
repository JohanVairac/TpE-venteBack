package com.example.TpEVenteBack.service;

import java.util.List;

import com.example.TpEVenteBack.metier.Commande;

public interface IserviceCommande {
	
	public Commande saveCommande( Commande com);
	public List< Commande> listCommandes();
	public  Commande getCommande(Long idCommande);
	public boolean deleteCommande (Long idCommande);
	public Commande updateCommande(Long idCommande,  Commande com);

}
