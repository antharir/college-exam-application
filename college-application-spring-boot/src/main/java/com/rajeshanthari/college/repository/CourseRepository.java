package com.rajeshanthari.college.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajeshanthari.college.model.Course;

public interface CourseRepository extends JpaRepository<Course, UUID> {

}
