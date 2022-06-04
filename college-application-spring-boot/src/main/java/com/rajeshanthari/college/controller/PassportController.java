package com.rajeshanthari.college.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajeshanthari.college.model.Passport;
import com.rajeshanthari.college.service.GenericService;
import com.rajeshanthari.college.service.PassportService;

@RestController
@RequestMapping("/passport")
public class PassportController extends GenericController<Passport> {

	@Autowired
	PassportService passportService;

	@Override
	public GenericService<Passport> getService() {
		return passportService;
	}

}
