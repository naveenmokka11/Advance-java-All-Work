package com.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class RationCard {
	@Id
	private int rid;
	private String color;
	private int pincode;

	@OneToMany(mappedBy = "card")

	private List<Familymember> familymember;

}
