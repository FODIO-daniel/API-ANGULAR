package com.tp9csc360.tp9.Models;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Commentaire")
public class Commentaire {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    protected Long id;

    @Column(name="nom_commentateur",nullable = false)
    protected String nom_commentateur;
    
    @Column(name="date_commentaire",nullable = false)
    protected Date date_commentateur;
    
    @ManyToOne()
    @JoinColumn(name = "commentaire_livre")
    private Livre commentaire_livre;
    
    @ManyToOne()
    @JoinColumn(name = "commentaire_lecteur")
    private Lecteur commentaire_lecteur;

	public Commentaire(Long id, String nom_commentateur, Date date_commentateur, Livre commentaire_livre,
			Lecteur commentaire_lecteur) {
		super();
		this.id = id;
		this.nom_commentateur = nom_commentateur;
		this.date_commentateur = date_commentateur;
		this.commentaire_livre = commentaire_livre;
		this.commentaire_lecteur = commentaire_lecteur;
	}

	public Commentaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom_commentateur() {
		return nom_commentateur;
	}

	public void setNom_commentateur(String nom_commentateur) {
		this.nom_commentateur = nom_commentateur;
	}

	public Date getDate_commentateur() {
		return date_commentateur;
	}

	public void setDate_commentateur(Date date_commentateur) {
		this.date_commentateur = date_commentateur;
	}

	public Livre getCommentaire_livre() {
		return commentaire_livre;
	}

	public void setCommentaire_livre(Livre commentaire_livre) {
		this.commentaire_livre = commentaire_livre;
	}

	public Lecteur getCommentaire_lecteur() {
		return commentaire_lecteur;
	}

	public void setCommentaire_lecteur(Lecteur commentaire_lecteur) {
		this.commentaire_lecteur = commentaire_lecteur;
	}

	@Override
	public String toString() {
		return "Commentaire [id=" + id + ", nom_commentateur=" + nom_commentateur + ", date_commentateur="
				+ date_commentateur + ", commentaire_livre=" + commentaire_livre + ", commentaire_lecteur="
				+ commentaire_lecteur + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(commentaire_lecteur, commentaire_livre, date_commentateur, id, nom_commentateur);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commentaire other = (Commentaire) obj;
		return Objects.equals(commentaire_lecteur, other.commentaire_lecteur)
				&& Objects.equals(commentaire_livre, other.commentaire_livre)
				&& Objects.equals(date_commentateur, other.date_commentateur) && Objects.equals(id, other.id)
				&& Objects.equals(nom_commentateur, other.nom_commentateur);
	}
    
    
}
