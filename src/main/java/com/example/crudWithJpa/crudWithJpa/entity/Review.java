package com.example.crudWithJpa.crudWithJpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Review {

	@Id
	@GeneratedValue
	private Long id;
	private String description;
	private String rating;
	
	public Review(String description, String rating) {
		super();
		this.description = description;
		this.rating = rating;
	}
	
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
}
