package com.tp9csc360.tp9.ServicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tp9csc360.tp9.Models.Lecteur;

import com.tp9csc360.tp9.Repository.LecteurRepository;
import com.tp9csc360.tp9.Services.LecteurService;

public class LecteurImpl implements LecteurService {
	@Autowired
	public LecteurRepository lecteurRepository;

	@Override
	public Lecteur saveLecteur(Lecteur lecteur) {
		// TODO Auto-generated method stub
		return this.lecteurRepository.save(lecteur);
	}

	@Override
	public Lecteur updateLecteur(Lecteur lecteur) {
		// TODO Auto-generated method stub
		return this.lecteurRepository.save(lecteur);
	}

	@Override
	public String deleteLecteurById(Long id) {
		// TODO Auto-generated method stub
		this.lecteurRepository.deleteById(id);
		return  "Lecteur Supprimé avec succes !";
	}

	@Override
	public String deleteLecteurByObject(Lecteur lecteur) {
		// TODO Auto-generated method stub
		this.lecteurRepository.deleteById(lecteur.getId());
		return "Lecteur Supprimé avec succes !";
	}

	@Override
	public List<Lecteur> getAllLecteur() {
		// TODO Auto-generated method stub
		return this.lecteurRepository.findAll();
	}

	@Override
	public Lecteur findLecteurById(Long id) {
		// TODO Auto-generated method stub
		return this.lecteurRepository.findById(id).orElse(null);
	}

	@Override
	public Lecteur findLecteurByNom(String nom) {
		// TODO Auto-generated method stub
		return this.lecteurRepository.findBynom(nom);
	}

	@Override
	public Lecteur findLecteurByPrenom(String prenom) {
		// TODO Auto-generated method stub
		return this.lecteurRepository.findBynom(prenom);
	}

}
