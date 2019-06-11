package com.example.TpEVenteBack.metier;

 import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
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
@Entity 
@DiscriminatorValue("Cli")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@ToString(callSuper=true)
public class Client extends Personne implements Serializable {
	public Client(@NonNull String nom, @NonNull String prenom, int age, String email, String mdp) {
	 super(nom, prenom, age);
		this.email = email;
		this.mdp = mdp;
	}
	 private String email;
	private String mdp;

	@JsonIgnore
	@XmlTransient
	@ToString.Exclude
	@ManyToMany
	private List<Produit> produits=new ArrayList<Produit>();

}
