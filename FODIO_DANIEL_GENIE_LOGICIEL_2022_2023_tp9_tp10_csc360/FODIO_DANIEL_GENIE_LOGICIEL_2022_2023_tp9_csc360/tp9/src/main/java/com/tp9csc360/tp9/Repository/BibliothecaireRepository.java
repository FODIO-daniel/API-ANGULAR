package com.tp9csc360.tp9.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.tp9csc360.tp9.Models.Bibliothecaire;


public interface BibliothecaireRepository extends JpaRepository<Bibliothecaire, Long>{

	 public Bibliothecaire findBynom(String nom);	
}
