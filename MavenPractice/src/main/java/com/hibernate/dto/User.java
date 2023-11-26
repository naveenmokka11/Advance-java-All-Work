package com.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String gender;
	private String country;
	private long phone;
	private String DOB;
	private double wallet;
	private String account_created_Date;
	private String adress;
	private long pincode;
	private String state;
	private String petname;
	
	
	public User(int id, String firstname, String lastname, String email, String password, String gender, String country,
			long phone, String dOB, double wallet, String account_created_Date, String adress, long pincode,
			String state, String petname) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.country = country;
		this.phone = phone;
		this.DOB = dOB;
		this.wallet = wallet;
		this.account_created_Date = account_created_Date;
		this.adress = adress;
		this.pincode = pincode;
		this.state = state;
		this.petname = petname;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}


	public String getDOB() {
		return DOB;
	}


	public void setDOB(String dOB) {
		DOB = dOB;
	}


	public double getWallet() {
		return wallet;
	}


	public void setWallet(double wallet) {
		this.wallet = wallet;
	}


	public String getAccount_created_Date() {
		return account_created_Date;
	}


	public void setAccount_created_Date(String account_created_Date) {
		this.account_created_Date = account_created_Date;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}


	public long getPincode() {
		return pincode;
	}


	public void setPincode(long pincode) {
		this.pincode = pincode;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getPetname() {
		return petname;
	}


	public void setPetname(String petname) {
		this.petname = petname;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", password=" + password + ", gender=" + gender + ", country=" + country + ", phone=" + phone
				+ ", DOB=" + DOB + ", wallet=" + wallet + ", account_created_Date=" + account_created_Date + ", adress="
				+ adress + ", pincode=" + pincode + ", state=" + state + ", petname=" + petname + "]";
	}
	
	
	
	
	
	

}
