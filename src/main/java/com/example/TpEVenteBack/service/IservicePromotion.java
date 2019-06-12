package com.example.TpEVenteBack.service;

import java.util.List;

import com.example.TpEVenteBack.metier.Promotion;

public interface IservicePromotion {

	public Promotion savePromotion(Promotion promo);

	public List<Promotion> listPromotions();

	public Promotion getPromotion(Long idPromo);

	public boolean deletePromotion(Long idPromo);
	

	public Promotion updatePromotion(Long idPromo, Promotion promo);
	
	public void attribuerProduit( Long idPromo,  Long idProduit);

}
