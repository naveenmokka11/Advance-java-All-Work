package com.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private int Clas;
	private String name;
	
	@OneToOne
	private Scholarship scholarship;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getClas() {
		return Clas;
	}
	public void setClas(int clas) {
		Clas = clas;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Scholarship getScholarship() {
		return scholarship;
	}
	public void setScholarship(Scholarship scholarship) {
		this.scholarship = scholarship;
	}
	
		public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int clas, String name) {
		super();
		Clas = clas;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Clas=" + Clas + ", name=" + name + ", scholarship=" + scholarship + "]";
	}

	
	
}
