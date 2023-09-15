package com.tp9csc360.tp9.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tp9csc360.tp9.Models.Lecteur;

public interface LecteurRepository extends JpaRepository<Lecteur,Long> {

	Lecteur findBynom(String nom);

}
