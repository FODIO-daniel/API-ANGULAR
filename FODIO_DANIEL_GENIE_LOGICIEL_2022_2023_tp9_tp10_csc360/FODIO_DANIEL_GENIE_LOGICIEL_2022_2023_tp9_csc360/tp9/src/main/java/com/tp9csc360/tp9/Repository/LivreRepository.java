package com.tp9csc360.tp9.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tp9csc360.tp9.Models.Livre;

public interface LivreRepository extends JpaRepository<Livre,Long>{

	Livre findBynom(String nom);

	Livre findByauteur(String auteur);

	Livre findByprix_de_location_journalier(String prix_de_location_journalier);

	;

}
