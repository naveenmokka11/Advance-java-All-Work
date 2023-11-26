package com.jsp.workZone.dto;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


import lombok.Data;
@Entity
@Data
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@Column(unique = true)
	private String email;
	private String password;
	private  long phone;
	private String gender;
	private int age;
	private String id_proof;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	@OneToMany
	private List<ClientBooking> bookings;
	


}
