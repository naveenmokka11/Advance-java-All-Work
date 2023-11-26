package com.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	private String job;
	private long phone;
	private String password;
	
	
	
		//constructors
	public Employee(int id, String name, String job, long phone, String password) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
		this.phone = phone;
		this.password = password;
	}
	
	public Employee() {
		super();
		
	}


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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

		

	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", job=" + job + ", phone=" + phone + ", password=" + password
				+ "]";
	}
	

}
