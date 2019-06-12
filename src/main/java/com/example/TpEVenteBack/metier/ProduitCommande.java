package com.example.TpEVenteBack.metier;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProduitCommande implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId//cle embarquee
  private ProduitCommandeId id;
	//declarartion des attributs qui feront partie de la table de jointure
  private Date dateCommande;
  private int nbreProduit;
public ProduitCommande(Date dateCommande, int nbreProduit) {
	super();
	this.dateCommande = dateCommande;
	this.nbreProduit = nbreProduit;

 	 

	 
}
}
  


