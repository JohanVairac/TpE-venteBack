package com.example.TpEVenteBack.metier;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
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
public class Commande implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idCommande;
	private Date dateCommande;
	private String etatCommande;
	
@XmlTransient
@ManyToOne
private Personne personne;

@JsonIgnore
@XmlTransient
@ToString.Exclude
@ManyToMany(mappedBy = "commandes")
 private List<Produit> produits=new ArrayList<Produit>();


@JsonIgnore
@XmlTransient
@ToString.Exclude
@OneToMany(mappedBy = "commande")
private List<EtatDeLaCommande> etatscommandes=new ArrayList<EtatDeLaCommande>();



}
