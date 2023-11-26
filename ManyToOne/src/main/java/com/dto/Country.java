package com.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String PrimeMinister;
	private String capital;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrimeMinister() {
		return PrimeMinister;
	}
	public void setPrimeMinister(String primeMinister) {
		PrimeMinister = primeMinister;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	public Country() {
		super();
		
	}
	public Country(String name, String primeMinister, String capital) {
		super();
		this.name = name;
		PrimeMinister = primeMinister;
		this.capital = capital;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "\nCountry [id=" + id + ", name=" + name + ", PrimeMinister=" + PrimeMinister + ", capital=" + capital
				+ "]";
	}
	
	
	

}
