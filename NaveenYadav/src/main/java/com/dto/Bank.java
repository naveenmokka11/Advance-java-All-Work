package com.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bank {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private long accNo;
	private long phone;
	private String branchName;
	private double Balance;
	private String AccountType;
	private  String Proof;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	public String getProof() {
		return Proof;
	}
	public void setProof(String proof) {
		Proof = proof;
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", accNo=" + accNo + ", phone=" + phone + ", branchName=" + branchName + ", Balance="
				+ Balance + ", AccountType=" + AccountType + ", Proof=" + Proof + "]";
	}
	
	
	
	
		
	
	
	
	
	
	
	

}
