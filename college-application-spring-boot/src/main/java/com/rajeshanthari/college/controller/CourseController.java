package com.rajeshanthari.college.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajeshanthari.college.model.Course;
import com.rajeshanthari.college.service.CourseService;
import com.rajeshanthari.college.service.GenericService;

@RestController
@RequestMapping("/course")
public class CourseController extends GenericController<Course> {

	@Autowired
	CourseService courceService;

	@Override
	public GenericService<Course> getService() {
		return courceService;
	}

}
