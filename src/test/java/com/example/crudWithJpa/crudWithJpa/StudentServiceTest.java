package com.example.crudWithJpa.crudWithJpa;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.crudWithJpa.crudWithJpa.entity.Student;
import com.example.crudWithJpa.crudWithJpa.service.StudentService;

@SpringBootTest
public class StudentServiceTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	StudentService studentServ;
	
	@Test
	public void basicTest() {
		Student student = studentServ.getStudentById(4L);
		logger.info("Student ---> {}", student);
		logger.info("Associated employee ---> {}", student.getPassport());
	}
}
