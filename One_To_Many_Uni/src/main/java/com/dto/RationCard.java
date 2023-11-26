package com.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class RationCard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private long phone;
	private String color;
	private String state;
	private int pincode;	
	@OneToMany
	private List <FamilyMember> familyMamber;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public List<FamilyMember> getFamilyMamber() {
		return familyMamber;
	}
	public void setFamilyMamber(List<FamilyMember> familyMamber) {
		this.familyMamber = familyMamber;
	}
	
	public RationCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RationCard(long phone, String color, String state, int pincode) {
		super();
		this.phone = phone;
		this.color = color;
		this.state = state;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "RationCard [id=" + id + ", phone=" + phone + ", color=" + color + ", state=" + state + ", pincode="
				+ pincode + ", familyMamber=" + familyMamber + "]";
	}

	
	
	
	
}
