package com.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String State;
	private String District;
	private String Street;
	private String D_no;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getD_no() {
		return D_no;
	}
	public void setD_no(String d_no) {
		D_no = d_no;
	}
	public Adress(String state, String district, String street, String d_no) {
		super();
		State = state;
		District = district;
		Street = street;
		D_no = d_no;
	}
	public Adress() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Adress [id=" + id + ", State=" + State + ", District=" + District + ", Street=" + Street + ", D_no="
				+ D_no + "]";
	}
	

}
