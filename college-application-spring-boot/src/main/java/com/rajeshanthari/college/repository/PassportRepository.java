package com.rajeshanthari.college.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajeshanthari.college.model.Passport;

public interface PassportRepository extends JpaRepository<Passport, UUID> {

}
