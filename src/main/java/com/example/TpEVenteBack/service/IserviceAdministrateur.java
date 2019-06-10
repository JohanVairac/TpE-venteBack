package com.example.TpEVenteBack.service;

import java.util.List;

import com.example.TpEVenteBack.metier.Administrateur;



public interface IserviceAdministrateur {
	
	public Administrateur saveAdministrateur( Administrateur a);
	public List< Administrateur> listAdministrateurs();
	public  Administrateur getAdministrateur(Long idPersonne);
	public boolean deleteAdministrateur (Long idPersonne);
	public  Administrateur updateAdministrateur(Long idPersonne,  Administrateur a);

}
