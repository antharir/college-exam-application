package com.rajeshanthari.college.service;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.rajeshanthari.college.model.Passport;
import com.rajeshanthari.college.model.Student;
import com.rajeshanthari.college.repository.StudentRepository;

@Service
public class StudentService extends GenericService<Student> {

	StudentRepository repository;

	public StudentService(StudentRepository repository) {
		this.repository = repository;
	}

	@Override
	public JpaRepository<Student, UUID> getRepository() {
		return repository;
	}

	@Override
	public void copyResource(Student source, Student destination) {
		source.copyStudent(destination);
	}

	public Student mapStudentToPassport(UUID studentId, Passport passport) {
		Student student = getReourceById(studentId);
		student.setPassport(passport);
		return repository.save(student);
	}

}
