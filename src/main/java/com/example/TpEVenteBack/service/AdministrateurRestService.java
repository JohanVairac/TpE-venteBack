package com.example.TpEVenteBack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.TpEVenteBack.dao.AdministrateurRepository;
import com.example.TpEVenteBack.metier.Administrateur;

@CrossOrigin("*")
@RestController
public class AdministrateurRestService implements IserviceAdministrateur {
	@Autowired
	private AdministrateurRepository administrateurRepository;
	
	@RequestMapping (value="administrateurs", method=RequestMethod.POST)
	@Override
	public Administrateur saveAdministrateur(@RequestBody Administrateur a) {
		// TODO Auto-generated method stub
		return administrateurRepository.save(a);
	}
	@RequestMapping(value="/administrateurs", method=RequestMethod.GET)
	@Override
	public List<Administrateur> listAdministrateurs() {
		// TODO Auto-generated method stub
		return administrateurRepository.findAll();
	}
	@RequestMapping(value="/administrateurs/{idPersonne}", method=RequestMethod.GET)
	@Override
	public Administrateur getAdministrateur(@PathVariable Long idPersonne) {
		// TODO Auto-generated method stub
		
		return administrateurRepository.getOne(idPersonne);
	}
	@RequestMapping(value="/administrateursdelete/{idPersonne}", method=RequestMethod.DELETE)
	@Override
	public boolean deleteAdministrateur(@PathVariable Long idPersonne) {
		// TODO Auto-generated method stub
		administrateurRepository.deleteById(idPersonne);
		return true;
	}
	@RequestMapping(value= "/administrateursupdate/{idPersonne}",method=RequestMethod.PUT)
	@Override
	public Administrateur updateAdministrateur(@PathVariable Long idPersonne,@RequestBody Administrateur a) {
		// TODO Auto-generated method stub
		a.setIdPersonne(idPersonne);
		return administrateurRepository.save(a);
	}

}
