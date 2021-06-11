package com.Model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Salarie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private int id;
	
	@Column(name = "nom", nullable = true, unique = false, length = 50)
	private String nom;
	
	@Column(name = "prenom", nullable = true, unique = false, length = 50)
	private String prenom;
	
	@Column(name = "salaire", nullable = true, unique = false, length = 50)
	private String salaire;
	
	@Column(name = "experience", nullable = true, unique = false, length = 50)
	private String experience;
	
	@OneToOne(mappedBy = "Directeur")
	private Directeur directeur;

	public Salarie(String string, String string2, int i, String string3) {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getSalaire() {
		return salaire;
	}

	public void setSalaire(String salaire) {
		this.salaire = salaire;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public Directeur getDirecteur() {
		return directeur;
	}

	public void setDirecteur(Directeur directeur) {
		this.directeur = directeur;
	}
	
}
