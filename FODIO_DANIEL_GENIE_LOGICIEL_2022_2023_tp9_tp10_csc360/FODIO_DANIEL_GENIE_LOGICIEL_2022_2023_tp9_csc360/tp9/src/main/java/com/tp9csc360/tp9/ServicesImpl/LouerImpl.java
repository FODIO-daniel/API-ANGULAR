package com.tp9csc360.tp9.ServicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tp9csc360.tp9.Models.Louer;

import com.tp9csc360.tp9.Repository.LouerRepository;
import com.tp9csc360.tp9.Services.LouerService;

public class LouerImpl implements LouerService{

	@Autowired
	public LouerRepository louerRepository;
	
	@Override
	public Louer saveLouer(Louer louer) {
		// TODO Auto-generated method stub
		return this.louerRepository.save(louer);
	}

	@Override
	public Louer updateLivre(Louer louer) {
		// TODO Auto-generated method stub
		return this.louerRepository.save(louer);
	}

	@Override
	public String deleteLouerById(Long id) {
		// TODO Auto-generated method stub
		this.louerRepository.deleteById(id);
		return  "Location Supprimé avec succes !";
	}

	@Override
	public String deleteLouerByObject(Louer louer) {
		// TODO Auto-generated method stub
		this.louerRepository.deleteById(louer.getId());
		return "Location Supprimé avec succes !";
	}

	@Override
	public List<Louer> getAllLouer() {
		// TODO Auto-generated method stub
		return this.louerRepository.findAll();
	}

	@Override
	public Louer findLouerById(Long id) {
		// TODO Auto-generated method stub
		return this.louerRepository.findById(id).orElse(null);
	}

	@Override
	public Louer findLouerByNom_du_livre(String nom_du_livre) {
		// TODO Auto-generated method stub
		return this.louerRepository.findBynom_du_livre(nom_du_livre);
	}

	@Override
	public Louer findLouerByNom_du_locataire(String nom_du_locataire) {
		// TODO Auto-generated method stub
		return this.louerRepository.findBynom_du_locataire(nom_du_locataire);
	}

	@Override
	public Louer findLouerByPrenom_du_locataire(String prenom_du_locataire) {
		// TODO Auto-generated method stub
		return this.louerRepository.findByprenom_du_locatair(prenom_du_locataire);
	}

	@Override
	public Louer findLouerByDate_location(String date_location) {
		// TODO Auto-generated method stub
		return this.louerRepository.findBydate_location(date_location);
	}

	@Override
	public Louer findLouerByPrix_de_location(String prix_de_location) {
		// TODO Auto-generated method stub
		return this.louerRepository.findByprix_de_location(prix_de_location);
	}

}
