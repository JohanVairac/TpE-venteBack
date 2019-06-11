 package com.example.TpEVenteBack.metier;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

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
@DiscriminatorValue("Adm")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@ToString(callSuper=true)
public class Administrateur extends Personne implements Serializable{
private long siret;

public Administrateur(@NonNull String nom, @NonNull String prenom, int age, long siret) {
	super(nom, prenom, age);
	this.siret = siret;
}


}
