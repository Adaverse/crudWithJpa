package com.example.crudWithJpa.crudWithJpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.crudWithJpa.crudWithJpa.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
