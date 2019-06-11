package com.example.TpEVenteBack.service;

import java.util.List;

import com.example.TpEVenteBack.metier.EtatDeLaCommande;





public interface IserviceEtatDeLaCommande {
	
	public  EtatDeLaCommande saveEtatDeLaCommande(EtatDeLaCommande etat);
	public List< EtatDeLaCommande> listEtatDeLaCommandes();
	public  EtatDeLaCommande getEtatDeLaCommande(Long idEtatCommande);
	public boolean deleteEtatDeLaCommande (Long idEtatCommande);
	
	public EtatDeLaCommande updateEtatDeLaCommande(Long idEtatCommande,  EtatDeLaCommande etat);

}
