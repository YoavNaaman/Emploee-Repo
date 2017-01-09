package com.hello.main.starter;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emploee {
	@Id
	private String id;
	private String firstName;
	private String boss;
	private ArrayList<Emploee> subordinates;
	
	
	public Emploee(String id, String firstName, String boss,
			ArrayList<Emploee> subordinates, String lastName) {
		super();
		this.id=
		this.firstName = firstName;
		this.boss = boss;
		this.subordinates = subordinates;
		this.lastName = lastName;
	}

	public String getBoss() {
		return boss;
	}

	public void setBoss(String boss) {
		this.boss = boss;
	}

	public List<Emploee> getSubordinates() {
		return subordinates;
	}

	public void setSubordinates(ArrayList<Emploee> subordinates) {
		this.subordinates = subordinates;
	}

	private String lastName;


	public String getId() {
		return id;
	}

	public Emploee() {

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
}
