package com.example.TpEVenteBack.metier;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity //annotation de jpa
@DiscriminatorValue("AdresL")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@ToString(callSuper=true)
public class AdresseLivraison extends Adresse implements Serializable {
private Date dateLivraison;

 public AdresseLivraison(@NotNull String numRue, @NotNull String nomRue, @NotNull String codePostal,
		@NotNull String pays, Date dateLivraison) {
	super(numRue, nomRue, codePostal, pays);
	this.dateLivraison = dateLivraison;
}

}
