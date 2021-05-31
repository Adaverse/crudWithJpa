package com.example.crudWithJpa.crudWithJpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudWithJpa.crudWithJpa.entity.Student;
import com.example.crudWithJpa.crudWithJpa.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repository;
	
	public Student getStudentById(Long id) {
		return repository.findById(id).orElse(null);
	}
	
	public Student saveStudent(Student student) {
		return repository.save(student);
	}
	
	public List<Student> saveStudents(List<Student> students) {
		return repository.saveAll(students);
	}
	
	
	public String deleteStudent(Long id) {
		repository.deleteById(id);
		return "Student removed !! with " + id;
	}
}
