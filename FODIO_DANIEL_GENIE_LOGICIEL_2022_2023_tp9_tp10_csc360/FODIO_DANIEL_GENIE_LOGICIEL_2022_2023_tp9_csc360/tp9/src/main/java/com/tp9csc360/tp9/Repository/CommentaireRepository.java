package com.tp9csc360.tp9.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.tp9csc360.tp9.Models.Commentaire;

public interface CommentaireRepository extends JpaRepository<Commentaire,Long>{

	Commentaire findBynom_commentateur(String nom_commentateur);

	Commentaire findBydate_commentateur(String date_commentateur);

}
