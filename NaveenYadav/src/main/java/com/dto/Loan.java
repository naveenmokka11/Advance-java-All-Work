package com.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Loan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private long Accountnumber;
	private int crediScore;
	private double income;
	private double loanAmount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAccountnumber() {
		return Accountnumber;
	}
	public void setAccountnumber(long accountnumber) {
		Accountnumber = accountnumber;
	}
	public int getCrediScore() {
		return crediScore;
	}
	public void setCrediScore(int crediScore) {
		this.crediScore = crediScore;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	@Override
	public String toString() {
		return "Loan [id=" + id + ", Accountnumber=" + Accountnumber + ", crediScore=" + crediScore + ", income="
				+ income + ", loanAmount=" + loanAmount + "]";
	}
	
	
	
	

}
