package com.Model;

import java.util.Set;

public class Salarie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private int id;
	
	@Column(name = "nom", nullable = true, unique = false, length = 50)
	private String nom;
	
	@Column(name = "prenom", nullable = true, unique = false, length = 50)
	private String prenom;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="client_id")
	private Set<Produit> produits;
	
	@OneToOne
	@JoinColumn(name="compte_id")
	private Compte compte;
}
