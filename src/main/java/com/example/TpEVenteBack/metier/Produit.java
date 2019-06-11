package com.example.TpEVenteBack.metier;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity //annotation de jpa
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Produit implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private long idProduit;
	private String nomProduit;
	private int quantite;
	private double prix;

	@XmlTransient
	@ManyToOne
	private Catalogue catalogue;
	
	
	@JsonIgnore
	@XmlTransient
	@ToString.Exclude
	@ManyToMany
	private List<Commande>commandes=new ArrayList<Commande>();
	
	@JsonIgnore
	@XmlTransient
	@ToString.Exclude
	@ManyToMany
	private List<Adresse> adresses=new ArrayList<Adresse>();
	

	@JsonIgnore
	@XmlTransient
	@ToString.Exclude
	@OneToMany(mappedBy="produit")
	 private List<Promotion> promotions =new ArrayList<Promotion>();
	
	
	@JsonIgnore
	@XmlTransient
	@ToString.Exclude
	@OneToMany(mappedBy="produits")
	private List<Client> clients =new ArrayList<Client>();
	
	
	
	
	
	
}
