package com.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Farmer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Name;
	private double land;
	private long phone;
	@OneToOne
	private FertilizersStore fertilizer;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getLand() {
		return land;
	}
	public void setLand(double land) {
		this.land = land;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public FertilizersStore getFertilizer() {
		return fertilizer;
	}
	public void setFertilizer(FertilizersStore fertilizer) {
		this.fertilizer = fertilizer;
	}
	public Farmer(String name, double land, long phone) {
		super();
		Name = name;
		this.land = land;
		this.phone = phone;
	}
	
	
	public Farmer() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "Farmer [id=" + id + ", Name=" + Name + ", land=" + land + ", phone=" + phone + ", fertilizer="
				+ fertilizer + "]";
	}
		
	
	
	
	

}
