package com.example.crudWithJpa.crudWithJpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudWithJpa.crudWithJpa.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Long>{

}
