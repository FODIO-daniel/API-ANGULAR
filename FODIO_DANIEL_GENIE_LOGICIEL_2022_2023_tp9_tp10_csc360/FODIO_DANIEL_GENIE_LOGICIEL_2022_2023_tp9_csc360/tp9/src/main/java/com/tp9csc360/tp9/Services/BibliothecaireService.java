package com.tp9csc360.tp9.Services;

import java.util.List;


import org.springframework.stereotype.Service;

import com.tp9csc360.tp9.Models.Bibliothecaire;


@Service
public interface BibliothecaireService {
	
	
	public Bibliothecaire saveBibliothecaire(Bibliothecaire bibliothecaire);
	
	public Bibliothecaire updateBibliothecaire(Bibliothecaire  bibliothecaire);
	
	public String deleteBibliothecaireById(Long id);
	
	public String deleteBibliothecaireByObject(Bibliothecaire bibliothecaire);

	public List<Bibliothecaire> getAllBibliothecaire();

	public Bibliothecaire findBibliothecaireById(Long id) ;
	
	public Bibliothecaire findBibliothecaireByNom(String nom);

}
