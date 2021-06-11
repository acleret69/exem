package com.Model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


public class Directeur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private int id;
	
	@Column(name = "nom", nullable = true, unique = false, length = 50)
	private String nom;
	
	@Column(name = "prenom", nullable = true, unique = false, length = 50)
	private String prenom;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="Salarie_id")
	private Set<Salarie> salarie;
	
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

	public Set<Salarie> getSalarie() {
		return salarie;
	}

	public void setSalarie(Set<Salarie> salarie) {
		this.salarie = salarie;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	@OneToOne
	@JoinColumn(name="hotel_id")
	private Hotel hotel;
}
