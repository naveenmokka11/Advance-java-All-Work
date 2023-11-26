package com.dto;

public class Passport {
	private int pass_name;
	private String name;
	private long phone;
	private String address;
	public int getPass_name() {
		return pass_name;
	}
	public void setPass_name(int pass_name) {
		this.pass_name = pass_name;
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
	public Passport(int pass_name, String name, long phone, String address) {
		super();
		this.pass_name = pass_name;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
