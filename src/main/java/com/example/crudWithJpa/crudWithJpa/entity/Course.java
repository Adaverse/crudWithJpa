package com.example.crudWithJpa.crudWithJpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COURSE")
public class Course {
	@Id
	@GeneratedValue
	private Long id;
	
	public Course() {
		super();
	}

	public Course(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Course(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	private String name;

}
