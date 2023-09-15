package com.tp9csc360.tp9.ServicesImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp9csc360.tp9.Models.Commentaire;

import com.tp9csc360.tp9.Repository.CommentaireRepository;
import com.tp9csc360.tp9.Services.CommentaireService;

@Service
public class CommentaireImpl implements CommentaireService{

	@Autowired
	public  CommentaireRepository  commentaireRepository;

	@Override
	public Commentaire saveCommentaire(Commentaire commentaire) {
		// TODO Auto-generated method stub
		return this.commentaireRepository.save(commentaire);
	}

	@Override
	public Commentaire updateCommentaire(Commentaire commentaire) {
		// TODO Auto-generated method stub
		return this.commentaireRepository.save(commentaire);
	}

	@Override
	public String deleteCommentaireById(Long id) {
		// TODO Auto-generated method stub
		this.commentaireRepository.deleteById(id);
		return  "commentaire Supprimé avec succes !";
	}

	@Override
	public String deleteCommentaireByObject(Commentaire commentaire) {
		// TODO Auto-generated method stub
		this.commentaireRepository.deleteById(commentaire.getId());
		return "Commentaire Supprimé avec succes !";
	}

	@Override
	public List<Commentaire> getAllCommentaire() {
		// TODO Auto-generated method stub
		return this.commentaireRepository.findAll();
	}

	@Override
	public Commentaire findCommentaireById(Long id) {
		// TODO Auto-generated method stub
		return this.commentaireRepository.findById(id).orElse(null);
	}

	@Override
	public Commentaire findBynom_commentateur(String nom_commentateur) {
		// TODO Auto-generated method stub
		return this.commentaireRepository.findBynom_commentateur(nom_commentateur);
	}

	

	@Override
	public Commentaire findBydate_commentateur(String  date_commentateur) {
		// TODO Auto-generated method stub
		return this.commentaireRepository.findBydate_commentateur( date_commentateur);
	}

}
