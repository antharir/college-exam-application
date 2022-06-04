package com.rajeshanthari.college.exception;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 889556558L;

	public ResourceNotFoundException() {
		super();
	}

	public ResourceNotFoundException(UUID resourceId) {
		super("Resource not found with id:" + resourceId);
	}

}
