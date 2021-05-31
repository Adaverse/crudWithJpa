package com.example.crudWithJpa.crudWithJpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudWithJpa.crudWithJpa.entity.Course;
import com.example.crudWithJpa.crudWithJpa.entity.Product;
import com.example.crudWithJpa.crudWithJpa.service.CourseService;

@RestController
public class CourseController {
	@Autowired
	CourseService service;
	
	@PostMapping("/addCourses")
	public List<Course> addCourses(@RequestBody List<Course> course) {
		return service.saveCourses(course);
	}

}
