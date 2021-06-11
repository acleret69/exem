package com.Model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Chambre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "num_chambre", nullable = false, unique = true)
	private int num_chambre;
	
	@Column(name = "superficie", nullable = true, unique = false, length = 50)
	private String nom;
	
	@Column(name = "type", nullable = true, unique = false, length = 50)
	private String type;
	
	@Column(name = "etage", nullable = true, unique = false, length = 50)
	private String etage;
	
	@OneToOne(mappedBy = "Chambre")
	private Chambre chambre;

	public Chambre(String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
	}

	public int getNum_chambre() {
		return num_chambre;
	}

	public void setNum_chambre(int num_chambre) {
		this.num_chambre = num_chambre;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEtage() {
		return etage;
	}

	public void setEtage(String etage) {
		this.etage = etage;
	}

	public Chambre getChambre() {
		return chambre;
	}

	public void setChambre(Chambre chambre) {
		this.chambre = chambre;
	}
}
