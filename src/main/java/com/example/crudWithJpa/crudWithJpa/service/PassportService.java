package com.example.crudWithJpa.crudWithJpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudWithJpa.crudWithJpa.entity.Passport;
import com.example.crudWithJpa.crudWithJpa.repository.PassportRespository;

@Service
public class PassportService {
	
	@Autowired
	private PassportRespository repository;
	
	public Passport getPassportById(Long id) {
		return repository.findById(id).orElse(null);
	}
	
	public Passport savePassport(Passport passport) {
		return repository.save(passport);
	}
	
	public List<Passport> savePassports(List<Passport> passports) {
		return repository.saveAll(passports);
	}
	
	
	public String deletePassport(Long id) {
		repository.deleteById(id);
		return "Passport removed !! with " + id;
	}
}
