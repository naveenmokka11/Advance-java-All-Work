package com.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentHackerRank {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String name;
	private String email;
	private int  noOfProblemsSloved;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNoOfProblemsSloved() {
		return noOfProblemsSloved;
	}
	public void setNoOfProblemsSloved(int noOfProblemsSloved) {
		this.noOfProblemsSloved = noOfProblemsSloved;
	}
	public StudentHackerRank(String name, String email, int noOfProblemsSloved) {
		super();
	
		this.name = name;
		this.email = email;
		this.noOfProblemsSloved = noOfProblemsSloved;
	}
	public StudentHackerRank() {
		super();
		
	}
	@Override
	public String toString() {
		return "StudentHackerRank [id=" + id + ", name=" + name + ", email=" + email + ", noOfProblemsSloved="
				+ noOfProblemsSloved + "]";
	}
	
	
	
	
	

}
