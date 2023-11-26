package com.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ScShip {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int scship_no;
	private String type;
	private long phone;
	private int ScShipYear;
	public int getScship_no() {
		return scship_no;
	}
	public void setScship_no(int scship_no) {
		this.scship_no = scship_no;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int getScShipYear() {
		return ScShipYear;
	}
	public void setScShipYear(int scShipYear) {
		ScShipYear = scShipYear;
	}
	public ScShip(String type, long phone, int scShipYear) {
		super();
		this.type = type;
		this.phone = phone;
		ScShipYear = scShipYear;
	}
	public ScShip() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "ScShip [scship_no=" + scship_no + ", type=" + type + ", phone=" + phone + ", ScShipYear=" + ScShipYear
				+ "]";
	}
	
	
	

}
