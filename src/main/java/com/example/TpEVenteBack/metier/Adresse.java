package com.example.TpEVenteBack.metier;

import java.io.Serializable;
import java.util.ArrayList;
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
import javax.validation.constraints.NotNull;
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
@DiscriminatorColumn(name="TYPE_AdRES")
@DiscriminatorValue("ADRES")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public abstract class Adresse implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private long idAdresse;
private @NotNull String numRue;
private @NotNull String nomRue;
private @NotNull String codePostal;
private @NotNull String pays;

@JsonIgnore
@XmlTransient
@ToString.Exclude
@ManyToMany(mappedBy = "adresses")
private List<Personne> personnes= new ArrayList<Personne>();

public Adresse(@NotNull String numRue, @NotNull String nomRue, @NotNull String codePostal, @NotNull String pays) {
	super();
	this.numRue = numRue;
	this.nomRue = nomRue;
	this.codePostal = codePostal;
	this.pays = pays;
}


}
