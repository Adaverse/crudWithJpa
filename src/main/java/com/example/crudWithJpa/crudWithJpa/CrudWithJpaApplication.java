package com.example.crudWithJpa.crudWithJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.crudWithJpa.crudWithJpa.entity.Passport;
import com.example.crudWithJpa.crudWithJpa.entity.Review;
import com.example.crudWithJpa.crudWithJpa.entity.Student;
import com.example.crudWithJpa.crudWithJpa.service.PassportService;
import com.example.crudWithJpa.crudWithJpa.service.ReviewService;
import com.example.crudWithJpa.crudWithJpa.service.StudentService;

@SpringBootApplication
public class CrudWithJpaApplication implements CommandLineRunner	{

	@Autowired
	StudentService studentServ;

	@Autowired
	PassportService passportServ;
	
	@Autowired
	ReviewService reviewServ;
	
	public static void main(String[] args) {
		SpringApplication.run(CrudWithJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student student = new Student("Raj");
		Student student1 = new Student("Baj");
		Student student2 = new Student("Saj");
		
		Passport passport1 = new Passport("E1234");
		student.setPassport(passport1);
		Passport passport2 = new Passport("E1234");
		student1.setPassport(passport2);
		Passport passport3 = new Passport("E1234");
		student2.setPassport(passport3);
		
		passportServ.savePassport(passport1);
		passportServ.savePassport(passport2);
		passportServ.savePassport(passport3);
		
		studentServ.saveStudent(student);
		studentServ.saveStudent(student1);
		studentServ.saveStudent(student2);
		
		Review review1 = new Review("Great Course", "5");
		Review review2 = new Review("Good Course", "4");
		Review review3 = new Review("Avg Course", "3");
		reviewServ.saveReview(review1);
		reviewServ.saveReview(review2);
		reviewServ.saveReview(review3);
	}

}
