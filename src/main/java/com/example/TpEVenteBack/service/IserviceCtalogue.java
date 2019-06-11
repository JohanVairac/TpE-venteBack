package com.example.TpEVenteBack.service;

import java.util.List;

import com.example.TpEVenteBack.metier.Catalogue;

public interface IserviceCtalogue {
	
	public Catalogue saveCatalogue(Catalogue c);
	public List< Catalogue> listCatalogues();
	public  Catalogue getCatalogue(Long idCatalogue);
	public boolean deleteCatalogue (Long idCatalogue);
	public Catalogue updateCatalogue(Long idCatalogue,  Catalogue c);

}
