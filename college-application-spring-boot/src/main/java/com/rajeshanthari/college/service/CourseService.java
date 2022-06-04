package com.rajeshanthari.college.service;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.rajeshanthari.college.model.Course;
import com.rajeshanthari.college.repository.CourseRepository;

@Service
public class CourseService extends GenericService<Course> {

	CourseRepository repository;

	public CourseService(CourseRepository repository) {
		this.repository = repository;
	}

	@Override
	public JpaRepository<Course, UUID> getRepository() {
		return repository;
	}

	@Override
	public void copyResource(Course source, Course destination) {
		source.copyCourse(destination);
	}

}
