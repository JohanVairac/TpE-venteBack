package com.example.TpEVenteBack.metier;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity //annotation de jpa
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class EtatDeLaCommande {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idEtatCommande;
	private Date dateCommande =new Date();
	private String EtatCommande;

	
	@XmlTransient
	@ManyToOne
	private Commande commande;
}
