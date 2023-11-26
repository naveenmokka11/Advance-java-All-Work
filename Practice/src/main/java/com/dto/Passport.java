package com.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pass_no;
	private String name;
	private long phone;
	private String address;
	
	public int getPass_no() {
		return pass_no;
	}
	public void setPass_no(int pass_no) {
		this.pass_no = pass_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Passport(String name, long phone, String address) {
		super();
	
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	public Passport() {
		super();
		
	}
	@Override
	public String toString() {
		return "Passport [pass_no=" + pass_no + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	
	


}