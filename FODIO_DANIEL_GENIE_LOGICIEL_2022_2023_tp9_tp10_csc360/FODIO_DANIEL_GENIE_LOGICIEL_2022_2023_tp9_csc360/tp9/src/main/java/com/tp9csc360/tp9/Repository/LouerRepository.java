package com.tp9csc360.tp9.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tp9csc360.tp9.Models.Louer;

public interface LouerRepository extends JpaRepository<Louer,Long>{

	Louer findBynom_du_livre(String nom_du_livre);

	Louer findBynom_du_locataire(String nom_du_locataire);

	Louer findByprenom_du_locatair(String prenom_du_locataire);

	Louer findBydate_location(String date_location);

	Louer findByprix_de_location(String prix_de_location);

}
