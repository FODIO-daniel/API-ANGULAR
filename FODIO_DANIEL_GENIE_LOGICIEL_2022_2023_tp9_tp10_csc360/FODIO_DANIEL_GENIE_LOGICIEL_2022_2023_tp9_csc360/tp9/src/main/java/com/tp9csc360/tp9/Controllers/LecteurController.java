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

import com.tp9csc360.tp9.Models.Lecteur;
import com.tp9csc360.tp9.Services.LecteurService;

@RestController
@RequestMapping("/Lecteur")
@CrossOrigin("*")

public class LecteurController {
	@Autowired
	public LecteurService lecteurService;
	
	
	@RequestMapping(value="/ajouterLecteur",method= RequestMethod.POST,headers="accept=Application/json")
	public Lecteur save(@RequestBody Lecteur Lecteur) {
		try {
			Lecteur=this.lecteurService.saveLecteur(Lecteur);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return Lecteur;
		
	}
	
	@RequestMapping(value="/getAllLecteurs",method= RequestMethod.GET,headers="accept=Application/json")
	public List<Lecteur> getAll() {
		List<Lecteur> Lecteurs=new ArrayList<>();
		try {
			Lecteurs=this.lecteurService.getAllLecteur();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return Lecteurs;
		
	}
	
	@RequestMapping(value="/updateLecteur",method= RequestMethod.PUT,headers="accept=Application/json")
	public Lecteur update(@RequestBody Lecteur Lecteur) {
		try {
			Lecteur=this.lecteurService.updateLecteur(Lecteur);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return Lecteur;
		
	}
	
	@RequestMapping(value = "/deleteLecteur", method =RequestMethod.DELETE)
	public String DeleteByObject(@RequestBody Lecteur Lecteur){
		 return this.lecteurService.deleteLecteurByObject(Lecteur);
	}

	
	@RequestMapping(value = "/deleteLecteur/{id}", method =RequestMethod.DELETE)
	public String DeleteById(@PathVariable("id") long id){
		 return this.lecteurService.deleteLecteurById(id);
	}
	
	
	
	@RequestMapping(value = "/findLecteurById/{id}", method =RequestMethod.GET)
	public Lecteur findById(@PathVariable("id") long id){
		 return this.lecteurService.findLecteurById(id);
	}

	
	
	@RequestMapping(value = "/findByNom_Lecteur", method =RequestMethod.GET)
	public Lecteur findByNom(@RequestBody String nom ){
		 return this.lecteurService.findLecteurByNom(nom);
	}
	
	@RequestMapping(value = "/findByPrenom_Lecteur", method =RequestMethod.GET)
	public Lecteur findLecteurByPrenom(@RequestBody String prenom ){
		 return this.lecteurService.findLecteurByPrenom(prenom);
	}
	

	
	

}
