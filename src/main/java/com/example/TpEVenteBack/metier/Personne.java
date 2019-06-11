package com.example.TpEVenteBack.metier;

 import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity //annotation de jpa
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_PERS")
@DiscriminatorValue("PERS")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public abstract class Personne implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idPersonne;
	private  @NonNull  String nom;
	private  @NonNull  String prenom;
	private int age;
	
	@JsonIgnore
	@XmlTransient
	@OneToMany(mappedBy = "personne")
	private List <MoyenDePaiment> moyensdepaiment=new ArrayList<MoyenDePaiment>();
	
	@JsonIgnore
	@XmlTransient
	@OneToMany(mappedBy = "personne")
	private List <Commande> commandes=new ArrayList<Commande>();
	
	@JsonIgnore
	@XmlTransient
	@ToString.Exclude
	@ManyToMany
	private List<Adresse> adresses= new ArrayList<Adresse>();

	public Personne(@NonNull String nom, @NonNull String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	
}
