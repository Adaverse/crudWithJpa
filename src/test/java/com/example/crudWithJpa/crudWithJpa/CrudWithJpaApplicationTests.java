package com.example.crudWithJpa.crudWithJpa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;

import com.example.crudWithJpa.crudWithJpa.repository.CourseRepository;
import com.example.crudWithJpa.crudWithJpa.service.CourseService;
import com.example.crudWithJpa.crudWithJpa.service.ProductService;
import com.example.crudWithJpa.crudWithJpa.entity.Course;
import com.example.crudWithJpa.crudWithJpa.entity.Product;

@SpringBootTest
class CrudWithJpaApplicationTests {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CourseService courseService;
	
	@Autowired
	ProductService productService;
	
//	@Test
//	void contextLoads() {
//		logger.info("this is running");
//		Course course = courseService.getCourseById(1000L);
//		logger.info(course.toString());
//		assertEquals("English", course.getName());
//	}
//	
//	@Test
//	void testingProduct() {
//		Product product = productService.getProductById(1);
//		assertEquals("name1_updated", product.getName());
//	}
//	
//	@Test 
//	public void deleteById() {
//		productService.deleteProduct(4);
//		assertNull(productService.getProductById(4));
//	}


}
