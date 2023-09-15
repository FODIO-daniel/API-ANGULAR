package com.tp9csc360.tp9.Services;

import java.util.List;

import org.springframework.stereotype.Service;


import com.tp9csc360.tp9.Models.Lecteur;

@Service
public interface LecteurService {
public Lecteur saveLecteur(Lecteur lecteur);
public Lecteur updateLecteur(Lecteur  lecteur);
	
	public String deleteLecteurById(Long id);
	
	public String deleteLecteurByObject(Lecteur lecteur);

	public List<Lecteur> getAllLecteur();

	public Lecteur findLecteurById(Long id) ;
	
	public Lecteur findLecteurByNom(String nom);
	
	public Lecteur findLecteurByPrenom(String prenom);


}
