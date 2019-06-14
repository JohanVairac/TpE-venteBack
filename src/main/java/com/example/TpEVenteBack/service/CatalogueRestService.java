package com.example.TpEVenteBack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.TpEVenteBack.dao.CatalogueRepository;
import com.example.TpEVenteBack.metier.Catalogue;

@CrossOrigin("*")
@RestController
public class CatalogueRestService implements IserviceCtalogue {
	@Autowired
	private CatalogueRepository catalogueRepository;
	
	@RequestMapping (value="catalogues", method=RequestMethod.POST)
	@Override
	public Catalogue saveCatalogue(@RequestBody Catalogue c) {
		return catalogueRepository.save(c);
	}
	@RequestMapping(value="/catalogues", method=RequestMethod.GET)
	@Override
	public List<Catalogue> listCatalogues() {
		// TODO Auto-generated method stub
		return catalogueRepository.findAll();
	}
	@RequestMapping(value="/catalogues/{idCatalogue}", method=RequestMethod.GET)
	@Override
	public Catalogue getCatalogue(@PathVariable Long idCatalogue) {
		// TODO Auto-generated method stub
		return catalogueRepository.getOne(idCatalogue);
	}
	@RequestMapping(value="/cataloguesdelete/{idCatalogue}", method=RequestMethod.DELETE)
	@Override
	public boolean deleteCatalogue(@PathVariable Long idCatalogue) {
		// TODO Auto-generated method stub
		catalogueRepository.deleteById(idCatalogue);
		return true;
	}
	@RequestMapping(value= "/cataloguesupdate/{idCatalogue}",method=RequestMethod.PUT)
	@Override
	public Catalogue updateCatalogue(@PathVariable Long idCatalogue,@RequestBody Catalogue c) {
		// TODO Auto-generated method stub
		c.setIdCatalogue(idCatalogue);
		return catalogueRepository.save(c);
	}

}
