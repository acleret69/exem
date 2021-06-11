package com.Service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.Model.Salarie;

public class SalarieService {
	public boolean create(Salarie sa, Session s)
	{
		s.save(sa); // INSERT INTO Client (nom, prenom) VALUES (c.getNom(), c.getPrenom());
		
		return true;
	}
	
	public void delete(Session s, int id)
	{
		Salarie sa = s.get(Salarie.class, id);
		s.delete(sa); 
	}
	
	public void update(Session s, int id)
	{
		Salarie sa = s.get(Salarie.class, id);
		sa.setPrenom("Paul");
		s.update(sa); // UPDATE client SET nom = c.getNom(), prenom = c.getPrenom() where id = id;
	}
	
	public Salarie findById(Session s, int id)
	{
		Salarie sa = s.get(Salarie.class, id); // SELECT * FROM client where id = id;
		return sa;
	}
	
	public List<Salarie> findAll(Session s)
	{
		Query q = s.createQuery("from Client");
		List<Salarie> listeC = q.list();
		
		return listeC;
	}
}
