package com.example.TpEVenteBack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.TpEVenteBack.dao.MoyenDePaimentRepository;
import com.example.TpEVenteBack.metier.MoyenDePaiment;

@CrossOrigin("*")
@RestController
public class MoyenDePaimentRestService implements IserviceMoyenDePaiment {
	@Autowired
	private MoyenDePaimentRepository moyenDePaimentRepository;
	
	@RequestMapping (value="moyenDePaiments", method=RequestMethod.POST)
	@Override
	public MoyenDePaiment saveMoyenDePaiment(@RequestBody MoyenDePaiment moy) {
		// TODO Auto-generated method stub
		return moyenDePaimentRepository.save(moy);
	}
	@RequestMapping(value="/moyenDePaiments", method=RequestMethod.GET)
	@Override
	public List<MoyenDePaiment> listMoyenDePaiments() {
		// TODO Auto-generated method stub
		return moyenDePaimentRepository.findAll();
	}
	@RequestMapping(value="/moyenDePaiments/{idPaiment}", method=RequestMethod.GET)
	@Override
	public MoyenDePaiment getMoyenDePaiment(@PathVariable Long idPaiment) {
		// TODO Auto-generated method stub
		return moyenDePaimentRepository.getOne(idPaiment);
	}
	@RequestMapping(value="/moyenDePaimentsdelete/{idPaiment}", method=RequestMethod.DELETE)
	@Override
	public boolean deleteMoyenDePaiment(@PathVariable Long idPaiment) {
		// TODO Auto-generated method stub
		moyenDePaimentRepository.deleteById(idPaiment);
		return true;
	}
	@RequestMapping(value= "/moyenDePaimentsupdate/{idPaiment}",method=RequestMethod.PUT)
	@Override
	public MoyenDePaiment updateMoyenDePaiment(@PathVariable Long idPaiment,@RequestBody MoyenDePaiment moy) {
		// TODO Auto-generated method stub
		moy.setIdPaiment(idPaiment);
		return moyenDePaimentRepository.save(moy);
	}

}
