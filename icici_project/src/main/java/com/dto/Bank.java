package com.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Bank {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String BranchName;
	private long accountNumber;
	private double BankBalance;
	private String BranchLocation;
	private long BankPhone;
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBranchName() {
		return BranchName;
	}
	public void setBranchName(String branchName) {
		BranchName = branchName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBankBalance() {
		return BankBalance;
	}
	public void setBankBalance(double bankBalance) {
		BankBalance = bankBalance;
	}
	public String getBranchLocation() {
		return BranchLocation;
	}
	public void setBranchLocation(String branchLocation) {
		BranchLocation = branchLocation;
	}
	public long getBankPhone() {
		return BankPhone;
	}
	public void setBankPhone(long bankPhone) {
		BankPhone = bankPhone;
	}
	
	
	@Override
	public String toString() {
		return "Bank [id=" + id + ", BranchName=" + BranchName + ", accountNumber=" + accountNumber + ", BankBalance="
				+ BankBalance + ", BranchLocation=" + BranchLocation + ", BankPhone=" + BankPhone + "]";
	}
	
	
	
	
	
	
	
	
}
