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
import lombok.NonNull;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity //annotation de jpa
@DiscriminatorValue("AdreF")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@ToString(callSuper=true)
public class AdresseFacturation extends Adresse implements Serializable {
	private Date dateFacturation;

	public AdresseFacturation(@NotNull String numRue, @NotNull String nomRue, @NotNull String codePostal,
			@NotNull String pays, Date dateFacturation) {
		super(numRue, nomRue, codePostal, pays);
		 this.dateFacturation = dateFacturation;
	}


}
