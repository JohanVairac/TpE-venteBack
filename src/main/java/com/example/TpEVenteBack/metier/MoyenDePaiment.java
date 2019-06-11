package com.example.TpEVenteBack.metier;

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
import lombok.NonNull;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity //annotation de jpa
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class MoyenDePaiment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idPaiment;
	private String modePaiment;
	
	@ManyToOne
	@XmlTransient
	private Personne personne;

}
