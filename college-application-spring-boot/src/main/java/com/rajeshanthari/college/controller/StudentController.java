package com.rajeshanthari.college.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajeshanthari.college.model.Passport;
import com.rajeshanthari.college.model.Student;
import com.rajeshanthari.college.service.GenericService;
import com.rajeshanthari.college.service.PassportService;
import com.rajeshanthari.college.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController extends GenericController<Student> {

	@Autowired
	StudentService studentService;

	@Autowired
	PassportService passportService;

	@Override
	public GenericService<Student> getService() {
		return studentService;
	}

	@PutMapping("{id}/passport/{passport}")
	public ResponseEntity<Student> mapToPassport(@PathVariable UUID id, @PathVariable UUID passport) {
		Passport passportObj = passportService.getReourceById(passport);
		return ResponseEntity.ok(studentService.mapStudentToPassport(id, passportObj));
	}

}
