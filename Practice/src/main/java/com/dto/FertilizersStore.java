package com.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FertilizersStore {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long storeNumber;
	private String DeelerName;
	private String Adresss;

	public long getStoreNumber() {
		return storeNumber;
	}

	public void setStoreNumber(long storeNumber) {
		this.storeNumber = storeNumber;
	}

	public String getDeelerName() {
		return DeelerName;
	}

	public void setDeelerName(String deelerName) {
		DeelerName = deelerName;
	}

	public String getAdresss() {
		return Adresss;
	}

	public void setAdresss(String adresss) {
		Adresss = adresss;
	}

	public FertilizersStore(String deelerName, String adresss) {
		super();
		DeelerName = deelerName;
		Adresss = adresss;
	}

	public FertilizersStore() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "FertilizersStore [storeNumber=" + storeNumber + ", DeelerName=" + DeelerName + ", Adresss=" + Adresss
				+ "]";
	}

}
