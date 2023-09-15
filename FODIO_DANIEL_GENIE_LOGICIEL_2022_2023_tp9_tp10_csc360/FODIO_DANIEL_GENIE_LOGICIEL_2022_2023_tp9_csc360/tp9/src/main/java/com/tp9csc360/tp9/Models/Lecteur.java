package com.tp9csc360.tp9.Models;

import java.util.Objects;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name="Lecteur")
public class Lecteur {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    protected Long id;

    @Column(name="nom",nullable = false)
    protected String nom;

    @Column(name="prenom",nullable = false)
    protected String prenom;
    
    @Column(name="password",nullable = false)
    protected String password;
    
    @Column(name="statu",nullable = false)
    protected boolean statu;
    
    @ManyToOne()
    @JoinColumn(name = "bibliothecaire_lecteur")
    private Bibliothecaire bibliothecaire_lecteur;
    
    @OneToMany(mappedBy = "louer_lecteur",fetch = FetchType.LAZY)
   	private Set<Louer> louers;
    
    @OneToMany(mappedBy = "commentaire_lecteur",fetch = FetchType.LAZY)
   	private Set<Commentaire> commentaire_lecteur;

	public Lecteur(Long id, String nom, String prenom, String password, boolean statu,
			Bibliothecaire bibliothecaire_lecteur, Set<Louer> louers, Set<Commentaire> commentaire_lecteur) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.password = password;
		this.statu = statu;
		this.bibliothecaire_lecteur = bibliothecaire_lecteur;
		this.louers = louers;
		this.commentaire_lecteur = commentaire_lecteur;
	}

	public Lecteur() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Lecteur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", password=" + password + ", statu="
				+ statu + ", bibliothecaire_lecteur=" + bibliothecaire_lecteur + ", louers=" + louers
				+ ", commentaire_lecteur=" + commentaire_lecteur + "]";
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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isStatu() {
		return statu;
	}

	public void setStatu(boolean statu) {
		this.statu = statu;
	}

	public Bibliothecaire getBibliothecaire_lecteur() {
		return bibliothecaire_lecteur;
	}

	public void setBibliothecaire_lecteur(Bibliothecaire bibliothecaire_lecteur) {
		this.bibliothecaire_lecteur = bibliothecaire_lecteur;
	}

	public Set<Louer> getLouers() {
		return louers;
	}

	public void setLouers(Set<Louer> louers) {
		this.louers = louers;
	}

	public Set<Commentaire> getCommentaire_lecteur() {
		return commentaire_lecteur;
	}

	public void setCommentaire_lecteur(Set<Commentaire> commentaire_lecteur) {
		this.commentaire_lecteur = commentaire_lecteur;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bibliothecaire_lecteur, commentaire_lecteur, id, louers, nom, password, prenom, statu);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lecteur other = (Lecteur) obj;
		return Objects.equals(bibliothecaire_lecteur, other.bibliothecaire_lecteur)
				&& Objects.equals(commentaire_lecteur, other.commentaire_lecteur) && Objects.equals(id, other.id)
				&& Objects.equals(louers, other.louers) && Objects.equals(nom, other.nom)
				&& Objects.equals(password, other.password) && Objects.equals(prenom, other.prenom)
				&& statu == other.statu;
	}
    
    
}
