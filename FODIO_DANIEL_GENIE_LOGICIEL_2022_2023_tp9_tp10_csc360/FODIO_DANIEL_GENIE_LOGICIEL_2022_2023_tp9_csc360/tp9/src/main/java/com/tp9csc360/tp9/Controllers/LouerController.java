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

import com.tp9csc360.tp9.Models.Louer;

import com.tp9csc360.tp9.Services.LouerService;

@RestController
@RequestMapping("/Livre")
@CrossOrigin("*")

public class LouerController {
	
	@Autowired
	public LouerService louerService;
	
	@RequestMapping(value="/ajouterLouer",method= RequestMethod.POST,headers="accept=Application/json")
	public Louer save(@RequestBody Louer Louer) {
		try {
			Louer=this.louerService.saveLouer(Louer);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return Louer;
		
	}
	
	@RequestMapping(value="/getAllLouers",method= RequestMethod.GET,headers="accept=Application/json")
	public List<Louer> getAll() {
		List<Louer> Louers=new ArrayList<>();
		try {
			Louers=this.louerService.getAllLouer();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return Louers;
		
	}
	
	
	
	@RequestMapping(value = "/deleteLouer", method =RequestMethod.DELETE)
	public String DeleteByObject(@RequestBody Louer Louer){
		 return this.louerService.deleteLouerByObject(Louer);
	}

	
	@RequestMapping(value = "/deleteLouer/{id}", method =RequestMethod.DELETE)
	public String DeleteById(@PathVariable("id") long id){
		 return this.louerService.deleteLouerById(id);
	}
	
	
	
	@RequestMapping(value = "/findLouerById/{id}", method =RequestMethod.GET)
	public Louer findById(@PathVariable("id") long id){
		 return this.louerService.findLouerById(id);
	}

	
	
	@RequestMapping(value = "/findByNom_du_livre", method =RequestMethod.GET)
	public Louer findByNom_livre(@RequestBody String nom_du_livre ){
		 return this.louerService.findLouerByNom_du_livre(nom_du_livre);
	}
	
	@RequestMapping(value = "/findBynom_du_locataire", method =RequestMethod.GET)
	public Louer findLouerBynom_du_locataire(@RequestBody String nom_du_locataire ){
		 return this.louerService.findLouerByNom_du_locataire(nom_du_locataire);
	}
	
	@RequestMapping(value = "/findByPrenom_du_locataire", method =RequestMethod.GET)
	public Louer findLouerByprenom_du_locataire(@RequestBody String prenom_du_locataire ){
		 return this.louerService.findLouerByPrenom_du_locataire(prenom_du_locataire);
	}
	
	@RequestMapping(value = "/findBydate_location", method =RequestMethod.GET)
	public Louer findLouerBydate_location(@RequestBody String date_location ){
		 return this.louerService.findLouerByDate_location(date_location);
	}
	
	


}
