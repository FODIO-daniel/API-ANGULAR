package com.tp9csc360.tp9.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tp9csc360.tp9.Models.Bibliothecaire;
import com.tp9csc360.tp9.Services.BibliothecaireService;

@RestController
@RequestMapping("/Bibliothecaire")
@CrossOrigin("*")
public class BibliothecaireController {

	@Autowired
	public BibliothecaireService bibliothecaireService;
	
	@RequestMapping(value="/ajouterBibliothecaire",method= RequestMethod.POST,headers="accept=Application/json")
	public Bibliothecaire save(@RequestBody Bibliothecaire Bibliothecaire) {
		try {
			Bibliothecaire=this.bibliothecaireService.saveBibliothecaire(Bibliothecaire);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return Bibliothecaire;
		
	}
	
	@RequestMapping(value="/getAllBibliothecaires",method= RequestMethod.GET,headers="accept=Application/json")
	public List<Bibliothecaire> getAll() {
		List<Bibliothecaire> Bibliothecaires=new ArrayList<>();
		try {
			Bibliothecaires=this.bibliothecaireService.getAllBibliothecaire();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return Bibliothecaires;
		
	}
	
	@RequestMapping(value="/updateBibliothecaire",method= RequestMethod.PUT,headers="accept=Application/json")
	public Bibliothecaire update(@RequestBody Bibliothecaire Bibliothecaire) {
		try {
			Bibliothecaire=this.bibliothecaireService.updateBibliothecaire(Bibliothecaire);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return Bibliothecaire;
		
	}
	
	@RequestMapping(value = "/deleteBibliothecaire", method =RequestMethod.DELETE)
	public String DeleteByObject(@RequestBody Bibliothecaire Bibliothecaire){
		 return this.bibliothecaireService.deleteBibliothecaireByObject(Bibliothecaire);
	}

	
	@RequestMapping(value = "/deleteBibliothecaire/{id}", method =RequestMethod.DELETE)
	public String DeleteById(@PathVariable("id") long id){
		 return this.bibliothecaireService.deleteBibliothecaireById(id);
	}
	
	
	
	@RequestMapping(value = "/findBibliothecaireById/{id}", method =RequestMethod.GET)
	public Bibliothecaire findById(@PathVariable("id") long id){
		 return this.bibliothecaireService.findBibliothecaireById(id);
	}

	
	
	@RequestMapping(value = "/findByNomBibliothecaire", method =RequestMethod.GET)
	public Bibliothecaire findByNomBibliothecaire(@RequestBody String NomBibliothecaire){
		 return this.bibliothecaireService.findBibliothecaireByNom(NomBibliothecaire);
	}
	
}
