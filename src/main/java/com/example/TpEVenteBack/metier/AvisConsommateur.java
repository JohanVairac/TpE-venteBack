package com.example.TpEVenteBack.metier;

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
public class AvisConsommateur {
	private static final long serialVersionUID = 1L;
	@EmbeddedId//cle embarquee
	  private AvisConsommateurId id;
		//declarartion des attributs qui feront partie de la table de jointure
	private String commentaires;
	public AvisConsommateur (String commentaires) {
		super();
		this.commentaires = commentaires;
	}
	 

	}



