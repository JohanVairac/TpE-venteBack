package com.example.TpEVenteBack;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.TpEVenteBack.dao.AdministrateurRepository;
import com.example.TpEVenteBack.dao.AdresseFacturationRepository;
import com.example.TpEVenteBack.dao.CatalogueRepository;
import com.example.TpEVenteBack.dao.ClientRepository;
import com.example.TpEVenteBack.dao.CommandeRepository;
import com.example.TpEVenteBack.dao.EtatDeLaCommandeRepository;
import com.example.TpEVenteBack.dao.ProduitRepository;
import com.example.TpEVenteBack.dao.PromotionRepository;
import com.example.TpEVenteBack.metier.Administrateur;
import com.example.TpEVenteBack.metier.Catalogue;
import com.example.TpEVenteBack.metier.Client;
import com.example.TpEVenteBack.metier.Commande;
import com.example.TpEVenteBack.metier.EtatDeLaCommande;
import com.example.TpEVenteBack.metier.Produit;
import com.example.TpEVenteBack.metier.Promotion;


@SpringBootApplication
public class TpEVenteBackApplication {

	public static <S> void main(String[] args) throws java.text.ParseException{
		ApplicationContext ctx =
				SpringApplication.run(TpEVenteBackApplication.class, args);
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		//ClientRepository dao=ctx.getBean(ClientRepository.class);
		ProduitRepository dao=ctx.getBean(ProduitRepository.class);
		//CommandeRepository dao=ctx.getBean(CommandeRepository.class);
		//AdresseFacturationRepository dao=ctx.getBean(AdresseFacturationRepository.class);
		//EtatDeLaCommandeRepository dao=ctx.getBean(EtatDeLaCommandeRepository.class);
	 //PromotionRepository dao=ctx.getBean(PromotionRepository.class);
	//  CatalogueRepository dao=ctx.getBean(CatalogueRepository.class);
//	dao.save( new Client("eddy","ayadi",28,"asmaayadi@gmail.com","souma"));
	   // dao.save( new Client("chaima","goushy",36,"elsagoushy@gmail.com","faroud"));
  	dao.save(new Produit(0, "cremeDenuit", 56 , 13.69, null, null, null, null, null));
//		dao.save(new Produit(0, "Robe", 48 , 12.69, null, null, null, null));
//		dao.save(new Produit(0, "chreeks", 69 , 36.25, null, null, null, null));
//	    dao.save(new Produit(0, "Sandalesrouges", 69 , 36.25, null, null, null, null));
	//dao.save(new Commande(df.parse("1990-03-21"),"livrée"));
//		dao.save(new Commande(0,df.parse("1992-09-12"), "retournée", null, null, null));
//		dao.save(new Commande(0,df.parse("1963-05-23"), "préparée", null, null, null));
//		dao.save(new Commande(0,df.parse("1995-10-17"), "préparée", null, null, null));
		//dao.save(new Administrateur("Wassim","Saadawi",36,1532555));
//		dao.save( new EtatDeLaCommande(new Date(),"livrée"));
//		dao.save( new EtatDeLaCommande(new Date(),"Payée"));
//		dao.save( new EtatDeLaCommande(new Date(),"Retournée"));
  //dao.save(new Promotion(0, df.parse("2014-10-17"),df.parse("1995-11-17"),16.25, null));
//    dao.save(new Promotion(0, df.parse("2000-10-19"),df.parse("1995-11-24"),16.25, null));
    //dao.save(new Promotion(0, df.parse("1995-03-15"),df.parse("1995-09-17"),16.25, null));
    //dao.save(new Catalogue(0,"vetementsHabillée",null));
	
	
    
//		dao.save(new Commande(df.parse("1995-10-17"),"livrée"));
//		dao.save(new Commande(df.parse("2015-10-26"),"payée"));
//		dao.save(new Commande(df.parse("2012-10-17"),"retounée"));
	}

}
