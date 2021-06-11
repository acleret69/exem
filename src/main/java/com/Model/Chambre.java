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
}
