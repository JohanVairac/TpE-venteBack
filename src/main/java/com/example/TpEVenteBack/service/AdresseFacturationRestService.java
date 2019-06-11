package com.example.TpEVenteBack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.TpEVenteBack.dao.AdresseFacturationRepository;
import com.example.TpEVenteBack.metier.AdresseFacturation;

@CrossOrigin("*")
@RestController
public class AdresseFacturationRestService implements IserviceAdresseFacturation {
	@Autowired
	private AdresseFacturationRepository adresseFacturationRepository;
	
	@RequestMapping (value="adresseFacturations", method=RequestMethod.POST)
	@Override
	public AdresseFacturation saveAdresseFacturation(@RequestBody AdresseFacturation adf) {
		// TODO Auto-generated method stub
		return adresseFacturationRepository.save(adf);
	}
	@RequestMapping(value="/adresseFacturation", method=RequestMethod.GET)
	@Override
	public List<AdresseFacturation> listAdresseFacturations() {
		// TODO Auto-generated method stub
		return adresseFacturationRepository.findAll();
	}
	@RequestMapping(value="/adresseFacturations/{idAdresse}", method=RequestMethod.GET)
	@Override
	public AdresseFacturation getAdresseFacturation(@PathVariable Long idAdresse) {
		// TODO Auto-generated method stub
		return adresseFacturationRepository.getOne(idAdresse);
	}
	@RequestMapping(value="/adresseFacturationdelete/{idAdresse}", method=RequestMethod.DELETE)
	@Override
	public boolean deleteAdresseFacturation(@PathVariable Long idAdresse) {
		// TODO Auto-generated method stub
		adresseFacturationRepository.deleteById(idAdresse);
		return true;
	}
	@RequestMapping(value= "/adresseFacturationsupdate/{idAdresse}",method=RequestMethod.PUT)
	@Override
	public AdresseFacturation updateAdresseFacturation(@PathVariable Long idAdresse,@RequestBody AdresseFacturation adf) {
		// TODO Auto-generated method stub
		adf.setIdAdresse(idAdresse);
		return adresseFacturationRepository.save(adf);
	}

}
