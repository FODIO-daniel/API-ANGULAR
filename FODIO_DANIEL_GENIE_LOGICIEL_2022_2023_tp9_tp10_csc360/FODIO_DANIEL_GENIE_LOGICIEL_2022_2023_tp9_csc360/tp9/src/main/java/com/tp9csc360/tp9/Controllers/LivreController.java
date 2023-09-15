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

import com.tp9csc360.tp9.Models.Livre;
import com.tp9csc360.tp9.Services.LivreService;

@RestController
@RequestMapping("/Livre")
@CrossOrigin("*")

public class LivreController {
	@Autowired
	public LivreService livreService;
	
	@RequestMapping(value="/ajouterLivre",method= RequestMethod.POST,headers="accept=Application/json")
	public Livre save(@RequestBody Livre Livre) {
		try {
			Livre=this.livreService.saveLivre(Livre);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return Livre;
		
	}
	
	@RequestMapping(value="/getAllLivres",method= RequestMethod.GET,headers="accept=Application/json")
	public List<Livre> getAll() {
		List<Livre> Livres=new ArrayList<>();
		try {
			Livres=this.livreService.getAllLivre();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return Livres;
		
	}
	
	@RequestMapping(value="/updateLivre",method= RequestMethod.PUT,headers="accept=Application/json")
	public Livre update(@RequestBody Livre Livre) {
		try {
			Livre=this.livreService.updateLivre(Livre);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return Livre;
		
	}
	
	@RequestMapping(value = "/deleteLivre", method =RequestMethod.DELETE)
	public String DeleteByObject(@RequestBody Livre Livre){
		 return this.livreService.deleteLivreByObject(Livre);
	}

	
	@RequestMapping(value = "/deleteLivre/{id}", method =RequestMethod.DELETE)
	public String DeleteById(@PathVariable("id") long id){
		 return this.livreService.deleteLivreById(id);
	}
	
	
	
	@RequestMapping(value = "/findLivreById/{id}", method =RequestMethod.GET)
	public Livre findById(@PathVariable("id") long id){
		 return this.livreService.findLivreById(id);
	}

	
	
	@RequestMapping(value = "/findByNom", method =RequestMethod.GET)
	public Livre findByNomLivre(@RequestBody String nom ){
		 return this.livreService.findLivreByNom(nom);
	}
	
	@RequestMapping(value = "/findByAuteur", method =RequestMethod.GET)
	public Livre findLivreByauteur(@RequestBody String auteur ){
		 return this.livreService.findLivreByAuteur(auteur);
	}
	
	@RequestMapping(value = "/findByprix", method =RequestMethod.GET)
	public Livre findLivreByprix(@RequestBody String prix_de_location_journalier ){
		 return this.livreService.findLivreByPrix_de_location_journalier(prix_de_location_journalier);
	}
	


}
