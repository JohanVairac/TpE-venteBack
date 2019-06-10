package com.example.TpEVenteBack.service;

import java.util.List;

import com.example.TpEVenteBack.metier.MoyenDePaiment;

public interface InterfaceMoyenDePaiment {
	
	public MoyenDePaiment saveMoyenDePaiment(MoyenDePaiment moy);
	public List< MoyenDePaiment> listMoyenDePaiments();
	public  MoyenDePaiment getMoyenDePaiment(Long idPaiment);
	public boolean deleteMoyenDePaiment (Long idPaiment);
	public MoyenDePaiment updateMoyenDePaiment(Long idPaiment,  MoyenDePaiment moy);

}
