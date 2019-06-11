package com.example.TpEVenteBack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.TpEVenteBack.dao.CommandeRepository;
import com.example.TpEVenteBack.metier.Commande;

@CrossOrigin("*")
@RestController
public class CommandeRestService implements IserviceCommande {
	@Autowired
	private CommandeRepository commandeRepository;
	
	@RequestMapping (value="commandes", method=RequestMethod.POST)
	@Override
	public Commande saveCommande(@RequestBody Commande com) {
		// TODO Auto-generated method stub
		return commandeRepository.save(com);
	}
	@RequestMapping(value="/commandes", method=RequestMethod.GET)
	@Override
	public List<Commande> listCommandes() {
		// TODO Auto-generated method stub
		return commandeRepository.findAll();
	}
	@RequestMapping(value="/commandes/{idCommande}", method=RequestMethod.GET)
	@Override
	public Commande getCommande(@PathVariable Long idCommande) {
		// TODO Auto-generated method stub
		return commandeRepository.getOne(idCommande);
	}
	@RequestMapping(value="/commandesdelete/{idCommande}", method=RequestMethod.DELETE)
	@Override
	public boolean deleteCommande(@PathVariable Long idCommande) {
		// TODO Auto-generated method stub
		commandeRepository.deleteById(idCommande);
		return true;
	}
	@RequestMapping(value= "/commandesupdate/{idCommande}",method=RequestMethod.PUT)
	@Override
	public Commande updateCommande(@PathVariable Long idCommande,@RequestBody Commande com) {
		// TODO Auto-generated method stub
		com.setIdCommande(idCommande);
		return commandeRepository.save(com);
	}

}
