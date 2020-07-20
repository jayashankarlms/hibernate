package com.telusko.hibernate;

import javax.persistence.Embeddable;

@Embeddable
public class AlienName {

	private String firstName;
	private String lastName;
	private String surName;
	
	public AlienName() {};
	
	public AlienName(String firstName, String lastName, String surName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.surName = surName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	
	
}
