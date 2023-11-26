package com.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private	String CFirstName;
	private	String CLastName;
	
	@Column(unique = true)
	private String CEmail;
	private	String CPassword;
	private	long phone;
	private	int age;
	private	String gender;
	private	String Address;
	@OneToOne
	private Bank bank;
//	private Loan loan;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCFirstName() {
		return CFirstName;
	}
	public void setCFirstName(String cFirstName) {
		CFirstName = cFirstName;
	}
	public String getCLastName() {
		return CLastName;
	}
	public void setCLastName(String cLastName) {
		CLastName = cLastName;
	}
	public String getCEmail() {
		return CEmail;
	}
	public void setCEmail(String cEmail) {
		CEmail = cEmail;
	}
	public String getCPassword() {
		return CPassword;
	}
	public void setCPassword(String cPassword) {
		CPassword = cPassword;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
//	public Loan getLoan() {
//		return loan;
//	}
//	public void setLoan(Loan loan) {
//		this.loan = loan;
//	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", CFirstName=" + CFirstName + ", CLastName=" + CLastName + ", CEmail=" + CEmail
				+ ", CPassword=" + CPassword + ", phone=" + phone + ", age=" + age + ", gender=" + gender + ", Address="
				+ Address + ", bank=" + bank + ", loan=" +   "]";
	}

	
	
	
	
	
	

}
