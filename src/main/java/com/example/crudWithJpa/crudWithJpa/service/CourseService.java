package com.example.crudWithJpa.crudWithJpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudWithJpa.crudWithJpa.entity.Course;
import com.example.crudWithJpa.crudWithJpa.entity.Product;
import com.example.crudWithJpa.crudWithJpa.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository repository;
	
	public Course getCourseById(Long id) {
		return repository.findById(id).orElse(null);
	}
	
	public Course saveCourse(Course course) {
		return repository.save(course);
	}
	
	public String deleteCourse(Long id) {
		repository.deleteById(id);
		return "Product removed !! with " + id;
	}
	
}
