package com.example.crudWithJpa.crudWithJpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudWithJpa.crudWithJpa.entity.Passport;

public interface PassportRespository extends JpaRepository<Passport, Long>{

}
