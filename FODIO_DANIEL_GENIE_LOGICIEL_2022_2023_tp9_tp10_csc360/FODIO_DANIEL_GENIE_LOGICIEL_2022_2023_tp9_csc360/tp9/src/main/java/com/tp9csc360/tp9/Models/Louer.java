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
@Table(name="Louer")
public class Louer {


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    protected Long id;

    @Column(name="nom_du_livre",nullable = false)
    protected String nom_du_livre;

    @Column(name="nom_du_locataire",nullable = false)
    protected String nom_du_locataire;
    
    @Column(name="prenom_du_locataire",nullable = false)
    protected String prenom_du_locataire;
    
    @Column(name="date_location",nullable = false)
    protected Date date_location;
    
    @Column(name="prix_de_location",nullable = false)
    protected float prix_de_location;
    
    
    @ManyToOne()
    @JoinColumn(name = "louer_livre")
    private Livre louer_livre;
    
    @ManyToOne()
    @JoinColumn(name = "louer_lecteur")
    private Lecteur louer_lecteur;

	public Louer(Long id, String nom_du_livre, String nom_du_locataire, String prenom_du_locataire, Date date_location,
			float prix_de_location, Livre louer_livre, Lecteur louer_lecteur) {
		super();
		this.id = id;
		this.nom_du_livre = nom_du_livre;
		this.nom_du_locataire = nom_du_locataire;
		this.prenom_du_locataire = prenom_du_locataire;
		this.date_location = date_location;
		this.prix_de_location = prix_de_location;
		this.louer_livre = louer_livre;
		this.louer_lecteur = louer_lecteur;
	}

	public Louer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom_du_livre() {
		return nom_du_livre;
	}

	public void setNom_du_livre(String nom_du_livre) {
		this.nom_du_livre = nom_du_livre;
	}

	public String getNom_du_locataire() {
		return nom_du_locataire;
	}

	public void setNom_du_locataire(String nom_du_locataire) {
		this.nom_du_locataire = nom_du_locataire;
	}

	public String getPrenom_du_locataire() {
		return prenom_du_locataire;
	}

	public void setPrenom_du_locataire(String prenom_du_locataire) {
		this.prenom_du_locataire = prenom_du_locataire;
	}

	public Date getDate_location() {
		return date_location;
	}

	public void setDate_location(Date date_location) {
		this.date_location = date_location;
	}

	public float getPrix_de_location() {
		return prix_de_location;
	}

	public void setPrix_de_location(float prix_de_location) {
		this.prix_de_location = prix_de_location;
	}

	public Livre getLouer_livre() {
		return louer_livre;
	}

	public void setLouer_livre(Livre louer_livre) {
		this.louer_livre = louer_livre;
	}

	public Lecteur getLouer_lecteur() {
		return louer_lecteur;
	}

	public void setLouer_lecteur(Lecteur louer_lecteur) {
		this.louer_lecteur = louer_lecteur;
	}

	@Override
	public String toString() {
		return "Louer [id=" + id + ", nom_du_livre=" + nom_du_livre + ", nom_du_locataire=" + nom_du_locataire
				+ ", prenom_du_locataire=" + prenom_du_locataire + ", date_location=" + date_location
				+ ", prix_de_location=" + prix_de_location + ", louer_livre=" + louer_livre + ", louer_lecteur="
				+ louer_lecteur + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(date_location, id, louer_lecteur, louer_livre, nom_du_livre, nom_du_locataire,
				prenom_du_locataire, prix_de_location);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Louer other = (Louer) obj;
		return Objects.equals(date_location, other.date_location) && Objects.equals(id, other.id)
				&& Objects.equals(louer_lecteur, other.louer_lecteur) && Objects.equals(louer_livre, other.louer_livre)
				&& Objects.equals(nom_du_livre, other.nom_du_livre)
				&& Objects.equals(nom_du_locataire, other.nom_du_locataire)
				&& Objects.equals(prenom_du_locataire, other.prenom_du_locataire)
				&& Float.floatToIntBits(prix_de_location) == Float.floatToIntBits(other.prix_de_location);
	}
    
    
    
}
