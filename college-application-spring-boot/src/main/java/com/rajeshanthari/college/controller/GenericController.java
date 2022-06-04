package com.rajeshanthari.college.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.rajeshanthari.college.service.GenericService;

public abstract class GenericController<T> {


	@GetMapping
	public ResponseEntity<List<T>> getAllStudents() {
		return ResponseEntity.ok(getService().getAllRecords());
	}

	public abstract GenericService<T> getService();

	@GetMapping("/{id}")
	public ResponseEntity<T> getresourceById(@PathVariable UUID id) {
		return ResponseEntity.ok(getService().getReourceById(id));
	}

	@PostMapping
	public ResponseEntity<T> newresource(@RequestBody T resource) {
		getService().save(resource);
		return new ResponseEntity<T>(resource, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<T> updateresource(@PathVariable UUID id, @RequestBody T resource) {
		getService().update(id, resource);
		return new ResponseEntity<T>(resource, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<T> deleteresourceById(@PathVariable UUID id) {
		return ResponseEntity.ok(getService().delete(id));
	}
}
