package com.example.TpEVenteBack.service;

import java.util.List;

import com.example.TpEVenteBack.metier.AdresseFacturation;

public interface InterfaceAdresseFacturation {
	
	public AdresseFacturation saveAdresseFacturation( AdresseFacturation adf);
	public List< AdresseFacturation> listAdresseFacturations();
	public  AdresseFacturation getAdresseFacturation(Long idAdresse);
	public boolean deleteAdresseFacturation (Long idAdresse);
	public  AdresseFacturation updateAdresseFacturation(Long idAdresse,  AdresseFacturation adf);

}
