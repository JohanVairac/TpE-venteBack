package com.example.TpEVenteBack.metier;

import java.io.Serializable;

import javax.persistence.Entity;
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
public class Produit implements Serializable{
	private long idProduit;
	private String nomProduit;
	private int quantite;
	private double prix;

	@XmlTransient
	@ManyToOne
	private Catalogue catalogue;
}
