package com.telusko.hibernate.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.telusko.hibernate.Alien;

public class AlienService {

	public void saveAlien(Alien alien, Session session) {
		Transaction tx = session.beginTransaction();

		session.save(alien);
		tx.commit();
	}

	public Alien fetchAlien(int id, Session session) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		Alien fetchAlien = session.get(Alien.class, id);
		tx.commit();
		return fetchAlien;
	}
}
