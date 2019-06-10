package com.example.TpEVenteBack.service;

import java.util.List;

import com.example.TpEVenteBack.metier.Client;



public interface IserviceClient {
	
	public Client saveClient(Client c);
	public List<Client> listClients();
	public Client getClient(Long idPersonne);
	public boolean deleteClient (Long idPersonne);
	public Client updateClient(Long idPersonne, Client c);

}
