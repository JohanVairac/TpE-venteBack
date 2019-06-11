package com.example.TpEVenteBack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.TpEVenteBack.dao.EtatDeLaCommandeRepository;
import com.example.TpEVenteBack.metier.EtatDeLaCommande;
@CrossOrigin("*")
@RestController
public class EtatDeLaCommandeRestService implements IserviceEtatDeLaCommande {
	
	@Autowired
	private EtatDeLaCommandeRepository etatDeLaCommandeRepository;
	
	@RequestMapping (value="etatDeLaCommandes", method=RequestMethod.POST)
	@Override
	public EtatDeLaCommande saveEtatDeLaCommande(@RequestBody EtatDeLaCommande etat) {
		// TODO Auto-generated method stub
		return etatDeLaCommandeRepository.save(etat);
	}
	@RequestMapping(value="/etatDeLaCommandes", method=RequestMethod.GET)
	@Override
	public List<EtatDeLaCommande> listEtatDeLaCommandes() {
		// TODO Auto-generated method stub
		return etatDeLaCommandeRepository.findAll();
	}
	@RequestMapping(value="/etatDeLaCommandes/{idEtatCommande}", method=RequestMethod.GET)
	@Override
	public EtatDeLaCommande getEtatDeLaCommande(@PathVariable Long idEtatCommande) {
		// TODO Auto-generated method stub
		return etatDeLaCommandeRepository.getOne(idEtatCommande);
	}
	@RequestMapping(value="/etatDeLaCommandesdelete/{idEtatCommande}", method=RequestMethod.DELETE)
	@Override
	public boolean deleteEtatDeLaCommande(@PathVariable Long idEtatCommande) {
		// TODO Auto-generated method stub
		etatDeLaCommandeRepository.deleteById(idEtatCommande);
		return true;
	}
	@RequestMapping(value= "/etatDeLaCommandesupdate/{idEtatCommande}",method=RequestMethod.PUT)
	@Override
	public EtatDeLaCommande updateEtatDeLaCommande(@PathVariable Long idEtatCommande,@RequestBody EtatDeLaCommande etat) {
		// TODO Auto-generated method stub
		etat.setIdEtatCommande(idEtatCommande);
		return etatDeLaCommandeRepository.save(etat);
	}

}
