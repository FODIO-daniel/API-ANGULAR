package com.tp9csc360.tp9.ServicesImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp9csc360.tp9.Models.Bibliothecaire;
import com.tp9csc360.tp9.Repository.BibliothecaireRepository;
import com.tp9csc360.tp9.Services.BibliothecaireService;

@Service
public class BibliothecaireImpl  implements BibliothecaireService{


	@Autowired
	public BibliothecaireRepository bibliothecaireRepository;
	
	@Override
	public Bibliothecaire saveBibliothecaire(Bibliothecaire bibliothecaire) {
		// TODO Auto-generated method stub
		return this.bibliothecaireRepository.save(bibliothecaire);
	}

	@Override
	public Bibliothecaire updateBibliothecaire(Bibliothecaire bibliothecaire) {
		// TODO Auto-generated method stub
		return this.bibliothecaireRepository.save(bibliothecaire);
	}

	@Override
	public String deleteBibliothecaireById(Long id) {
		// TODO Auto-generated method stub
		this.bibliothecaireRepository.deleteById(id);
		return  "bibliothecaire Supprimé avec succes !";
	}

	@Override
	public String deleteBibliothecaireByObject(Bibliothecaire bibliothecaire) {
		// TODO Auto-generated method stub
		this.bibliothecaireRepository.deleteById(bibliothecaire.getId());
		return "bibliothecaire Supprimé avec succes !";
	}

	@Override
	public List<Bibliothecaire> getAllBibliothecaire() {
		// TODO Auto-generated method stub
		return this.bibliothecaireRepository.findAll();
	}

	@Override
	public Bibliothecaire findBibliothecaireById(Long id) {
		// TODO Auto-generated method stub
		return this.bibliothecaireRepository.findById(id).orElse(null);
	}

	@Override
	public Bibliothecaire findBibliothecaireByNom(String nom) {
		// TODO Auto-generated method stub
		return this.bibliothecaireRepository.findBynom(nom);
	}



}
