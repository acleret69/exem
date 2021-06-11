package com.Exame_java;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import com.Model.Chambre;
import com.Model.Salarie;
import com.Service.ChambreService;
import com.Service.SalarieService;

public class Principal {
public static void main(String[] args) {
		
		SalarieService ss = new SalarieService();

		Salarie s1 = new Salarie("Jean", "Jacques",1200,"edn");
		
		Chambre c1 = new Chambre("123", "3000m", "VIP","5ème étages");
		Chambre c2 = new Chambre("13", "1500m", "Normale","2ème étages");
		
		Set<Chambre> listeP = new HashSet<Chambre>();
		listeP.add(c1);
		listeP.add(c2);
		
		c1.setChambre(c1);
		c2.setChambre(c2);
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
//		cs.delete(session, 3);
//		c1.setPrenom("Paul");
//		cs.update(session, 2);
		Salarie s2 = ss.findById(session, 1);
		System.out.println("nom : " + c2.getNom() + ", type : " + c2.getType() + ", liste chambres : " + c2.getChambre().toString());
		
		List<Salarie> listeC = ss.findAll(session);

		for(Salarie cli : listeC)
		{
			System.out.println("nom : " + cli.getNom() + ", prenom : " + cli.getPrenom());
		}
		
		
		
		session.getTransaction().commit();
		HibernateUtil.shutdown();

	}
}
