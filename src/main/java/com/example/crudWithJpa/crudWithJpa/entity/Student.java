package com.example.crudWithJpa.crudWithJpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT_TBL")
public class Student {
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	@OneToOne
	private Passport passport;
	
	public Student() {
		super();
	}

	public Student(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Student(String name) {
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
	
	public Passport getPassport() {
		return this.passport;
	}
	
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
}
