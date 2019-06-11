package com.example.TpEVenteBack;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.TpEVenteBack.dao.AdministrateurRepository;
import com.example.TpEVenteBack.dao.ClientRepository;
import com.example.TpEVenteBack.dao.CommandeRepository;
import com.example.TpEVenteBack.dao.ProduitRepository;
import com.example.TpEVenteBack.metier.Administrateur;
import com.example.TpEVenteBack.metier.Client;
import com.example.TpEVenteBack.metier.Commande;
import com.example.TpEVenteBack.metier.Produit;


@SpringBootApplication
public class TpEVenteBackApplication {

	public static void main(String[] args) throws java.text.ParseException{
		ApplicationContext ctx =
				SpringApplication.run(TpEVenteBackApplication.class, args);
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		//ClientRepository dao=ctx.getBean(ClientRepository.class);
		//ProduitRepository dao=ctx.getBean(ProduitRepository.class);
		//CommandeRepository dao=ctx.getBean(CommandeRepository.class);
		AdministrateurRepository dao=ctx.getBean(AdministrateurRepository.class);
//		dao.save( new Client("asma","ayadi",28,"asmaayadi@gmail.com","souma"));
//		dao.save( new Client("elsa","goushy",36,"elsagoushy@gmail.com","faroud"));
//		dao.save(new Produit(0, "cremeDenuit", 56 , 13.69, null, null, null, null, null));
//		dao.save(new Produit(0, "Robe", 48 , 12.69, null, null, null, null, null));
		//dao.save(new Produit(0, "chreeks", 69 , 36.25, null, null, null, null, null));
	 //dao.save(new Produit(0, "Sandales", 69 , 36.25, null, null, null, null, null));
	//dao.save(new Commande(df.parse("1990-03-21"),"livrée"));
//		dao.save(new Commande(0,df.parse("1992-09-12"), "retournée", null, null, null));
//		dao.save(new Commande(0,df.parse("1963-05-23"), "préparée", null, null, null));
//		dao.save(new Commande(0,df.parse("1995-10-17"), "préparée", null, null, null));
		dao.save(new Administrateur("Wassim","Saadawi",36,1532555));
	
	}

}
