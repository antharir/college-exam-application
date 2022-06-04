package com.rajeshanthari.college.service;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajeshanthari.college.exception.ResourceNotFoundException;

public abstract class GenericService<T> {

	public List<T> getAllRecords() {
		return getRepository().findAll();
	}

	public T getReourceById(UUID id) {
		return getRepository().findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public T save(T resource) {
		getRepository().save(resource);
		return resource;
	}

	public T delete(UUID id) {
		T studentById = getReourceById(id);
		getRepository().deleteById(id);
		return studentById;
	}

	public T update(UUID id, T resource) {
		T existingResource = getReourceById(id);
		copyResource(resource, existingResource);
		getRepository().save(resource);
		return resource;
	}

	public abstract JpaRepository<T, UUID> getRepository();

	public abstract void copyResource(T source, T destination);

}
