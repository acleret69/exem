package com.Service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.Model.Chambre;

public abstract class ChambreService {
	
	public boolean create(Chambre c, Session s)
	{
		s.save(c); // INSERT INTO Produit (nom, prenom) VALUES (c.getNom(), c.getPrenom());
		
		return true;
	}
	
	public void delete(Session s, int id)
	{
		Chambre c = s.get(Chambre.class, id);
		s.delete(c); 
	}
	
	public void update(Session s, int id)
	{
		Chambre c = s.get(Chambre.class, id);
		c.setType("VIP");
		s.update(c); // UPDATE Produit SET nom = c.getNom(), prenom = c.getPrenom() where id = id;
	}
	
	public Chambre findById(Session s, int id)
	{
		Chambre c = s.get(Chambre.class, id); // SELECT * FROM Produit where id = id;
		return c;
	}
	
	public List<Chambre> findAll(Session s)
	{
		Query q = s.createQuery("from Produit");
		List<Chambre> listeC = q.list();
		
		return listeC;
	}
}
