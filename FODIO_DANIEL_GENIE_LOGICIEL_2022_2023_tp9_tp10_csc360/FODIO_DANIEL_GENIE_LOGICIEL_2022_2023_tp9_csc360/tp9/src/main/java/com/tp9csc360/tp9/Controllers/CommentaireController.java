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

import com.tp9csc360.tp9.Models.Commentaire;
import com.tp9csc360.tp9.Services.CommentaireService;

@RestController
@RequestMapping("/Commentaire")
@CrossOrigin("*")
public class CommentaireController {
	@Autowired
	public CommentaireService commentaireService;
	
	@RequestMapping(value="/ajouterCommentaire",method= RequestMethod.POST,headers="accept=Application/json")
	public Commentaire save(@RequestBody Commentaire Commentaire) {
		try {
			Commentaire=this.commentaireService.saveCommentaire(Commentaire);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return Commentaire;
		
	}
	
	@RequestMapping(value="/getAllCommentaires",method= RequestMethod.GET,headers="accept=Application/json")
	public List<Commentaire> getAll() {
		List<Commentaire> Commentaires=new ArrayList<>();
		try {
			Commentaires=this.commentaireService.getAllCommentaire();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return Commentaires;
		
	}
	
	@RequestMapping(value="/updateCommentaire",method= RequestMethod.PUT,headers="accept=Application/json")
	public Commentaire update(@RequestBody Commentaire Commentaire) {
		try {
			Commentaire=this.commentaireService.updateCommentaire(Commentaire);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return Commentaire;
		
	}
	
	@RequestMapping(value = "/deleteCommentaire", method =RequestMethod.DELETE)
	public String DeleteByObject(@RequestBody Commentaire Commentaire){
		 return this.commentaireService.deleteCommentaireByObject(Commentaire);
	}

	
	@RequestMapping(value = "/deleteCommentaire/{id}", method =RequestMethod.DELETE)
	public String DeleteById(@PathVariable("id") long id){
		 return this.commentaireService.deleteCommentaireById(id);
	}
	
	
	
	@RequestMapping(value = "/findCommentaireById/{id}", method =RequestMethod.GET)
	public Commentaire findById(@PathVariable("id") long id){
		 return this.commentaireService.findCommentaireById(id);
	}

	
	
	@RequestMapping(value = "/findByNom_Commentateur", method =RequestMethod.GET)
	public Commentaire findBynom_commentateure(@RequestBody String nom_commentateur ){
		 return this.commentaireService.findBynom_commentateur(nom_commentateur);
	}
	
	@RequestMapping(value = "/findBydate_Commentateur", method =RequestMethod.GET)
	public Commentaire findBydate_commentateur(@RequestBody String date_commentateur ){
		 return this.commentaireService.findBydate_commentateur(date_commentateur);
	}
	

}
