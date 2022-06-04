package com.rajeshanthari.college.exceptionhandler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.rajeshanthari.college.exception.ResourceNotFoundException;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = { ResourceNotFoundException.class })
	public ResponseEntity<Object> handleStudentNotFound(RuntimeException exception, WebRequest webRequest) {
		return handleExceptionInternal(exception,
				new ExceptionResponse(exception.getClass().getName(), exception.getMessage(), HttpStatus.NOT_FOUND),
				new HttpHeaders(), HttpStatus.NOT_FOUND, webRequest);
	}
}
