package com.example.TpEVenteBack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.TpEVenteBack.dao.ClientRepository;
import com.example.TpEVenteBack.metier.Client;
import com.example.TpEVenteBack.service.IserviceClient;



@CrossOrigin("*")
@RestController
public class ClientRestService implements IserviceClient {
	@Autowired
	private ClientRepository clientRepository;
	
	@RequestMapping(value="/clients", method=RequestMethod.GET)
	public List<Client> listClients() {
		return clientRepository.findAll();
	}
	@RequestMapping(value="/clients/{idPersonne}", method=RequestMethod.GET)
	@Override
	public Client getClient(@PathVariable Long idPersonne) {
		return clientRepository.getOne(idPersonne);
	}
	
	@RequestMapping(value="/clientsdelete/{idPersonne}", method=RequestMethod.DELETE)
	@Override
	public boolean deleteClient(@PathVariable Long idPersonne) {
		clientRepository.deleteById(idPersonne);
		return true;
	}
	
	@RequestMapping(value= "/clientsupdate/{idPersonne}",method=RequestMethod.PUT)
	@Override
	public Client updateClient(@PathVariable Long idPersonne, @RequestBody Client c) {
		c.setIdPersonne(idPersonne);
		return clientRepository.save(c);
	}
	
	@RequestMapping (value="/clients", method=RequestMethod.POST)
	@Override
	public Client saveClient(Client c) {
		return clientRepository.save(c);

}
