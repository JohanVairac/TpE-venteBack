package com.example.TpEVenteBack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.TpEVenteBack.dao.ProduitRepository;
import com.example.TpEVenteBack.metier.Produit;

@CrossOrigin("*")
@RestController
public class ProduitRestService implements IserviceProduit {
	@Autowired
	private ProduitRepository produitRepository;
	
	@RequestMapping (value="produits", method=RequestMethod.POST)
	@Override
	public Produit saveProduit(@RequestBody Produit p) {
		// TODO Auto-generated method stub
		return produitRepository.save(p);
	}
	@RequestMapping(value="/produits", method=RequestMethod.GET)
	@Override
	public List<Produit> listProduits() {
		// TODO Auto-generated method stub
		return produitRepository.findAll();
	}
	@RequestMapping(value="/produits/{idProduit}", method=RequestMethod.GET)
	@Override
	public Produit getProduit(@PathVariable Long idProduit) {
		// TODO Auto-generated method stub
		return produitRepository.getOne(idProduit);
	}
	@RequestMapping(value="/produitsdelete/{idProduit}", method=RequestMethod.DELETE)
	@Override
	public boolean deleteProduit(@PathVariable Long idProduit) {
		// TODO Auto-generated method stub
		produitRepository.deleteById(idProduit);
		
		return true;
	}
	@RequestMapping(value= "/produitsupdate/{idProduit}",method=RequestMethod.PUT)
	@Override
	public Produit updateProduit(@PathVariable Long idProduit,@RequestBody Produit p) {
		// TODO Auto-generated method stub
		p.setIdProduit(idProduit);
		return produitRepository.save(p);
	}
	@RequestMapping(value= "/produits/{idProduit}/{idCatalogue}",method=RequestMethod.PUT)
	
	@Override
	public void attribuerCategorie(@PathVariable Long idProduit, @PathVariable Long idCatalogue) {
		// TODO Auto-generated method stub
		
		produitRepository.attribuerCategorie(idProduit, idCatalogue);
		
	}
	@RequestMapping(value = "/produitsCatalogue/{idCatalogue}",method = RequestMethod.GET)
	@Override
	public List<Produit> produitCatalogue(@PathVariable long idCatalogue) {
		// TODO Auto-generated method stub
		return produitRepository.produitCatalogue(idCatalogue);
	}
	
	

}
