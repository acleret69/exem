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
	
}
