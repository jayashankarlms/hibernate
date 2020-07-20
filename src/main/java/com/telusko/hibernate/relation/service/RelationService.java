package com.telusko.hibernate.relation.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.hibernate.relation.Laptop;
import com.telusko.hibernate.relation.Student;

public class RelationService {
	Laptop laptop = new Laptop(101,"dell");
	Laptop laptop1 = new Laptop(102,"Acer");
	Student student = new Student(1,"jay",100);
	Student student1 = new Student(2,"shankar",100);
	public void operation() {
        //create session
        Session session = createSession();
        Transaction tx = session.beginTransaction();
        saveStudent(session);
        saveLaptop(session);
        tx.commit();
        
	}
	private Session createSession() {
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		return session;
	}
	private void saveStudent(Session session) {
		//for one to one relations
//		student.setLaptop(laptop);
		
		//for one to many relations
		student.getLaptop().add(laptop);
		student.getLaptop().add(laptop1);
		
		student1.getLaptop().add(laptop);
		student1.getLaptop().add(laptop1);
		
		session.save(student);
		session.save(student1);
    }
	
	private void saveLaptop(Session session) {
		//one to many relation and many to one relation
//		laptop.setStudent(student);
//		laptop1.setStudent(student);
		
		laptop.getStudent().add(student);
		laptop.getStudent().add(student1);
		
		laptop1.getStudent().add(student);
		laptop1.getStudent().add(student1);
		session.save(laptop);
		session.save(laptop1);
	}
}