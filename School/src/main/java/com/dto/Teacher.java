package com.dto;

public class Teacher {
	
	private int id;
	private String name;
	private String email;
	private String subject;
	private long phone;
	private School school;

	public Teacher(int id, String name, String email, String subject, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.subject = subject;
		this.phone = phone;
		
	}

	
	
	
	public Teacher(int id, String name, String email, String subject, long phone, School school) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.subject = subject;
		this.phone = phone;
		this.school = school;
	}




	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", email=" + email + ", subject=" + subject + ", phone=" + phone
				+ ", school=" + school + "]";
	}




			
	

}
