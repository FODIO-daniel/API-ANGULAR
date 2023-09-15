package com.tp9csc360.tp9.Services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.tp9csc360.tp9.Models.Commentaire;

@Service
public interface CommentaireService {
public Commentaire saveCommentaire(Commentaire commentaire);
	
	public Commentaire updateCommentaire(Commentaire  commentaire);
	
	public String deleteCommentaireById(Long id);
	
	public String deleteCommentaireByObject(Commentaire commentaire);

	public List<Commentaire> getAllCommentaire();

	public Commentaire findCommentaireById(Long id) ;
	
	public Commentaire findBynom_commentateur(String nom_commentateur);
	
	public Commentaire findBydate_commentateur(String date_commentateur);

	

}
