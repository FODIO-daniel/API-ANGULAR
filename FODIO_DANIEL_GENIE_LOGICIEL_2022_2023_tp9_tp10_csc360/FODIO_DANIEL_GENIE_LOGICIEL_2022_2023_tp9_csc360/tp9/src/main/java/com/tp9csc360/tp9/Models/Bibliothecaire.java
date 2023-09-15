package com.tp9csc360.tp9.Models;

import java.util.Objects;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name="Bibliothecaire")
public class Bibliothecaire {
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
    
    @OneToMany(mappedBy = "bibliothecaire_lecteur",fetch = FetchType.LAZY)
	private Set<Lecteur> lecteurs;
    
    @OneToMany(mappedBy = "bibliothecaire_livre",fetch = FetchType.LAZY)
   	private Set<Livre> livres;

	public Bibliothecaire(Long id, String nom, String prenom, String password, Set<Lecteur> lecteurs,
			Set<Livre> livres) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.password = password;
		this.lecteurs = lecteurs;
		this.livres = livres;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(id, lecteurs, livres, nom, password, prenom);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bibliothecaire other = (Bibliothecaire) obj;
		return Objects.equals(id, other.id) && Objects.equals(lecteurs, other.lecteurs)
				&& Objects.equals(livres, other.livres) && Objects.equals(nom, other.nom)
				&& Objects.equals(password, other.password) && Objects.equals(prenom, other.prenom);
	}



	public Bibliothecaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bibliothecaire [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", password=" + password
				+ ", lecteurs=" + lecteurs + ", livres=" + livres + "]";
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

	public Set<Lecteur> getLecteurs() {
		return lecteurs;
	}

	public void setLecteurs(Set<Lecteur> lecteurs) {
		this.lecteurs = lecteurs;
	}

	public Set<Livre> getLivres() {
		return livres;
	}

	public void setLivres(Set<Livre> livres) {
		this.livres = livres;
	}
    
    
}
