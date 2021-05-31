package com.example.crudWithJpa.crudWithJpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudWithJpa.crudWithJpa.entity.Review;
import com.example.crudWithJpa.crudWithJpa.repository.ReviewRepository;

@Service
public class ReviewService {
	@Autowired
	private ReviewRepository repository;
	
	public Review getReviewById(Long id) {
		return repository.findById(id).orElse(null);
	}
	
	public Review saveReview(Review review) {
		return repository.save(review);
	}
	
	public List<Review> saveReviews(List<Review> reviews) {
		return repository.saveAll(reviews);
	}
	
	
	public String deleteReview(Long id) {
		repository.deleteById(id);
		return "Review removed !! with " + id;
	}
}
