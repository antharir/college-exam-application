package com.rajeshanthari.college.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajeshanthari.college.model.Student;

public interface StudentRepository extends JpaRepository<Student, UUID> {

}
