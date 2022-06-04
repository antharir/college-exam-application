package com.rajeshanthari.college.service;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.rajeshanthari.college.model.Passport;
import com.rajeshanthari.college.repository.PassportRepository;

@Service
public class PassportService extends GenericService<Passport> {

	PassportRepository repository;

	public PassportService(PassportRepository repository) {
		this.repository = repository;
	}

	@Override
	public JpaRepository<Passport, UUID> getRepository() {
		return repository;
	}

	@Override
	public void copyResource(Passport source, Passport destination) {
		source.copyPassport(destination);
	}

}
