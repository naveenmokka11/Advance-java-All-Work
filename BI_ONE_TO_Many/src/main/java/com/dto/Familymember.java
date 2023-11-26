package com.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Familymember {
	@Id
	private int id;
	private String name;
	private String gender;
	
	@ManyToOne
	@JoinColumn
	private RationCard card;
	

}
