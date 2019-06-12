package com.example.TpEVenteBack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.TpEVenteBack.dao.PromotionRepository;
import com.example.TpEVenteBack.metier.Promotion;
@CrossOrigin("*")
@RestController
public class PromotionRestService implements IservicePromotion {
	
	@Autowired
	private PromotionRepository promotionRepository;
	
	@RequestMapping (value="promotions", method=RequestMethod.POST)
	@Override
	public Promotion savePromotion(@RequestBody Promotion promo) {
		// TODO Auto-generated method stub
		return promotionRepository.save(promo);
	}
	@RequestMapping(value="/promotions", method=RequestMethod.GET)
	@Override
	public List<Promotion> listPromotions() {
		// TODO Auto-generated method stub
		return promotionRepository.findAll();
	}
	@RequestMapping(value="/promotions/{idPromo}", method=RequestMethod.GET)
	@Override
	public Promotion getPromotion(@PathVariable Long idPromo) {
		// TODO Auto-generated method stub
		return promotionRepository.getOne(idPromo);
	}
	@RequestMapping(value="/promotionsdelete/{idPromo}", method=RequestMethod.DELETE)
	@Override
	public boolean deletePromotion(@PathVariable Long idPromo) {
		// TODO Auto-generated method stub
		promotionRepository.deleteById(idPromo);
		return true;
	}
	@RequestMapping(value= "/promotionsupdate/{idPromo}",method=RequestMethod.PUT)
	@Override
	public Promotion updatePromotion(@PathVariable Long idPromo, @RequestBody Promotion promo) {
		// TODO Auto-generated method stub
		promo.setIdPromo(idPromo);
		return promotionRepository.save(promo);
	}
	
	@RequestMapping(value= "/promotions/{idPromo}/{idProduit}",method=RequestMethod.PUT)
	@Override
	public void attribuerProduit(@PathVariable Long idPromo,@PathVariable  Long idProduit) {
		promotionRepository.attribuerProduit(idPromo, idProduit);
	}

}
