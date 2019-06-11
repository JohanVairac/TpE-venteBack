package com.example.TpEVenteBack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.TpEVenteBack.dao.AdresseLivraisonRepository;
import com.example.TpEVenteBack.metier.AdresseLivraison;

@CrossOrigin("*")
@RestController
public class AdresseLivraisonRestService implements IserviceAdresseLivraison {
	@Autowired
	private AdresseLivraisonRepository adresseLivraisonRepository;
	
	@RequestMapping (value="adresseLivraisons", method=RequestMethod.POST)
	@Override
	public AdresseLivraison saveAdresseLivraison(@RequestBody AdresseLivraison adl) {
		// TODO Auto-generated method stub
		return adresseLivraisonRepository.save(adl);
	}
	@RequestMapping(value="/adresseLivraisons", method=RequestMethod.GET)
	@Override
	public List<AdresseLivraison> listAdresseLivraisons() {
		// TODO Auto-generated method stub
		return adresseLivraisonRepository.findAll();
	}
	@RequestMapping(value="/adresseLivraisons/{idAdresse}", method=RequestMethod.GET)
	@Override
	public AdresseLivraison getAdresseLivraison(@PathVariable Long idAdresse) {
		// TODO Auto-generated method stub
		return adresseLivraisonRepository.getOne(idAdresse);
	}
	@RequestMapping(value="/adresseLivraisonsdelete/{idAdresse}", method=RequestMethod.DELETE)
	@Override
	public boolean deleteAdresseLivraison(@PathVariable Long idAdresse) {
		// TODO Auto-generated method stub
		adresseLivraisonRepository.deleteById(idAdresse);
		return true;
	}
	@RequestMapping(value= "/adresseLivraisonsupdate/{idAdresse}",method=RequestMethod.PUT)
	@Override
	public AdresseLivraison updateAdresseLivraison(@PathVariable Long idAdresse,@RequestBody AdresseLivraison adl) {
		// TODO Auto-generated method stub
		adl.setIdAdresse(idAdresse);
		return adresseLivraisonRepository.save(adl);
	}

}
