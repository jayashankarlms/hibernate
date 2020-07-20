package com.telusko.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="alien_new")
public class Alien {

	@Id
//	@GeneratedValue
	private int aid;
	
	private AlienName aname;
	
	@Column(name="alien_color")
	private String color;
	
	public Alien() {
		
	}
	public Alien(int aid, AlienName aname, String color) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.color = color;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public AlienName getAname() {
		return aname;
	}
	public void setAname(AlienName aname) {
		this.aname = aname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}
	
	
}
