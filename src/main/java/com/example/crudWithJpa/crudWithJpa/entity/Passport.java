package com.example.crudWithJpa.crudWithJpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passport {
	@Id
	@GeneratedValue
	private Long id;
	
	private String number;
	
	public Passport() {
		super();
	}

	public Passport(Long id, String number) {
		super();
		this.id = id;
		this.number = number;
	}
	
	public Passport(String number) {
		super();
		this.number = number;
	}

	@Override
	public String toString() {
		return "Passport [id=" + id + ", name=" + number + "]";
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Long getId() {
		return id;
	}
}
