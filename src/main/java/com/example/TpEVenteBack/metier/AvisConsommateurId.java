package com.example.TpEVenteBack.metier;

 import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable // classe embarque dans Emprunt //pour ne pas lafficher dans BDD
@NoArgsConstructor // generer les constructeurs sans arguments
@AllArgsConstructor // generer les constructeurs avec arguments
@Setter // generer les setters
@EqualsAndHashCode
public class AvisConsommateurId  implements Serializable{
	
	 public Produit getProduit() {
	      return produit;
	 }
	  public Client getClient() {
			return client;
	 }
	 @ManyToOne
		@JoinColumn(name = "Produit_Id")
		private Produit produit;
		@ManyToOne
		@JoinColumn(name = "Client_Id")
		private Client client;

	}


