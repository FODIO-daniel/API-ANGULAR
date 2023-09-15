package com.tp9csc360.tp9.Services;

import java.util.List;

import org.springframework.stereotype.Service;


import com.tp9csc360.tp9.Models.Livre;

@Service
public interface LivreService {
	public Livre saveLivre(Livre livre);
	public Livre updateLivre(Livre  livre);
		
		public String deleteLivreById(Long id);
		
		public String deleteLivreByObject(Livre livre);

		public List<Livre> getAllLivre();

		public Livre findLivreById(Long id) ;
		
		public Livre findLivreByNom(String nom);
		
		public Livre findLivreByAuteur(String auteur);
		
		public Livre findLivreByPrix_de_location_journalier(String prix_de_location_journalier);

}
