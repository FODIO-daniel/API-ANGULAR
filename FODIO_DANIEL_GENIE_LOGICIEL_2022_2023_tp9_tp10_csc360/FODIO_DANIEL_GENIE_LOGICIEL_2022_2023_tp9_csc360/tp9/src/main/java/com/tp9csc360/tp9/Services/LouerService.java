package com.tp9csc360.tp9.Services;

import java.util.List;

import org.springframework.stereotype.Service;


import com.tp9csc360.tp9.Models.Louer;

@Service
public interface LouerService {
	public Louer saveLouer(Louer louer);
	public Louer updateLivre(Louer  louer);
		
		public String deleteLouerById(Long id);
		
		public String deleteLouerByObject(Louer louer);

		public List<Louer> getAllLouer();

		public Louer findLouerById(Long id) ;
		
		public Louer findLouerByNom_du_livre(String nom_du_livre);
		
		public Louer findLouerByNom_du_locataire(String nom_du_locataire);
		
		public Louer findLouerByPrenom_du_locataire(String prenom_du_locataire);
		
		
		public Louer findLouerByDate_location(String date_location);
		
		
		
		public Louer findLouerByPrix_de_location(String prix_de_location);


}
