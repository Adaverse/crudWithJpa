package com.example.crudWithJpa.crudWithJpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudWithJpa.crudWithJpa.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

	
}
