package com.tp9csc360.tp9.Models;

import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Livre")
public class Livre {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    protected Long id;

    @Column(name="nom",nullable = false)
    protected String nom;

    @Column(name="auteur",nullable = false)
    protected String auteur;
    
    @Column(name="description",nullable = false)
    protected String description;
    
    @Column(name="prix_de_location_journalier",nullable = false)
    protected String prix_de_location_journalier;
    
    @ManyToOne()
    @JoinColumn(name = "bibliothecaire_livre")
    private Bibliothecaire bibliothecaire_livre;
    
    @OneToMany(mappedBy = "louer_livre",fetch = FetchType.LAZY)
   	private Set<Livre> louer_livre;
    
    @OneToMany(mappedBy = "commentaire_livre",fetch = FetchType.LAZY)
   	private Set<Commentaire> commentaires;

	public Livre(Long id, String nom, String auteur, String description, String prix_de_location_journalier,
			Bibliothecaire bibliothecaire_livre, Set<Livre> louer_livre, Set<Commentaire> commentaires) {
		super();
		this.id = id;
		this.nom = nom;
		this.auteur = auteur;
		this.description = description;
		this.prix_de_location_journalier = prix_de_location_journalier;
		this.bibliothecaire_livre = bibliothecaire_livre;
		this.louer_livre = louer_livre;
		this.commentaires = commentaires;
	}

	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrix_de_location_journalier() {
		return prix_de_location_journalier;
	}

	public void setPrix_de_location_journalier(String prix_de_location_journalier) {
		this.prix_de_location_journalier = prix_de_location_journalier;
	}

	public Bibliothecaire getBibliothecaire_livre() {
		return bibliothecaire_livre;
	}

	public void setBibliothecaire_livre(Bibliothecaire bibliothecaire_livre) {
		this.bibliothecaire_livre = bibliothecaire_livre;
	}

	public Set<Livre> getLouer_livre() {
		return louer_livre;
	}

	public void setLouer_livre(Set<Livre> louer_livre) {
		this.louer_livre = louer_livre;
	}

	public Set<Commentaire> getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(Set<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}

	@Override
	public String toString() {
		return "Livre [id=" + id + ", nom=" + nom + ", auteur=" + auteur + ", description=" + description
				+ ", prix_de_location_journalier=" + prix_de_location_journalier + ", bibliothecaire_livre="
				+ bibliothecaire_livre + ", louer_livre=" + louer_livre + ", commentaires=" + commentaires + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(auteur, bibliothecaire_livre, commentaires, description, id, louer_livre, nom,
				prix_de_location_journalier);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livre other = (Livre) obj;
		return Objects.equals(auteur, other.auteur) && Objects.equals(bibliothecaire_livre, other.bibliothecaire_livre)
				&& Objects.equals(commentaires, other.commentaires) && Objects.equals(description, other.description)
				&& Objects.equals(id, other.id) && Objects.equals(louer_livre, other.louer_livre)
				&& Objects.equals(nom, other.nom)
				&& Objects.equals(prix_de_location_journalier, other.prix_de_location_journalier);
	}

    
}
