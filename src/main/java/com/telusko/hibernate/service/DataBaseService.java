package com.telusko.hibernate.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.telusko.hibernate.Alien;
import com.telusko.hibernate.AlienName;

public class DataBaseService {
	
	public void operation() {
		AlienService alienService = new AlienService();
        //create session
        Session session = createSession();
        
//        fetchAlien(alienService, session);
        saveAlien(alienService, session);
	}
	private Session createSession() {
		Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		return session;
	}
	private void saveAlien(AlienService alienService, Session session) {
    	AlienName alienName = new AlienName("Jaya Shankar","LMS","Mohan");
    	Alien alien = new Alien(1,alienName,"yellow");
    	alienService.saveAlien(alien, session);
    }
    private void fetchAlien(AlienService alienService, Session session) {
        Alien fetchAlien = alienService.fetchAlien(7, session);
        System.out.println(fetchAlien);
    }
}
