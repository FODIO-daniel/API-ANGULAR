package com.tp9csc360.tp9.ServicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tp9csc360.tp9.Models.Livre;

import com.tp9csc360.tp9.Repository.LivreRepository;
import com.tp9csc360.tp9.Services.LivreService;

public class LivreImpl implements LivreService{

	@Autowired
	public LivreRepository livreRepository ;
	
	@Override
	public Livre saveLivre(Livre livre) {
		// TODO Auto-generated method stub
		return this.livreRepository.save(livre);
	}

	@Override
	public Livre updateLivre(Livre livre) {
		// TODO Auto-generated method stub
		return this.livreRepository.save(livre);
	}

	@Override
	public String deleteLivreById(Long id) {
		// TODO Auto-generated method stub
		this.livreRepository.deleteById(id);
		return  "Livre Supprimé avec succes !";
	}

	@Override
	public String deleteLivreByObject(Livre livre) {
		// TODO Auto-generated method stub
		this.livreRepository.deleteById(livre.getId());
		return "Livre Supprimé avec succes !";
	}

	@Override
	public List<Livre> getAllLivre() {
		// TODO Auto-generated method stub
		return this.livreRepository.findAll();
	}

	@Override
	public Livre findLivreById(Long id) {
		// TODO Auto-generated method stub
		return this.livreRepository.findById(id).orElse(null);
	}

	@Override
	public Livre findLivreByNom(String nom) {
		// TODO Auto-generated method stub
		return this.livreRepository.findBynom(nom);
	}

	@Override
	public Livre findLivreByAuteur(String auteur) {
		// TODO Auto-generated method stub
		return this.livreRepository.findByauteur(auteur);
	}

	@Override
	public Livre findLivreByPrix_de_location_journalier(String prix_de_location_journalier) {
		// TODO Auto-generated method stub
		return this.livreRepository.findByprix_de_location_journalier(prix_de_location_journalier);
	}

}
