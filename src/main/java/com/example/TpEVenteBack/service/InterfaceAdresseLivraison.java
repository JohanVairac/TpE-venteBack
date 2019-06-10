package com.example.TpEVenteBack.service;

import java.util.List;

import com.example.TpEVenteBack.metier.AdresseLivraison;

public interface InterfaceAdresseLivraison {
	
	public AdresseLivraison saveAdresseLivraison( AdresseLivraison adl);
	public List< AdresseLivraison> listAdresseLivraisons();
	public  AdresseLivraison getAdresseLivraison(Long idAdresse);
	public boolean deleteAdresseLivraison (Long idAdresse);
	public  AdresseLivraison updateAdresseLivraison(Long idAdresse,  AdresseLivraison adl);

}
