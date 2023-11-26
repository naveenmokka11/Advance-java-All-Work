package com.dto;

public class School {
	
	
	private int id;
	private String name;
	private String email;
	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", website=" + website
				+ "]";
	}
	private long phone;
	private String website;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
		
	
	

}
