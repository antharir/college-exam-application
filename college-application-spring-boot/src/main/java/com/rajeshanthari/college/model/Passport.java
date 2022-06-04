package com.rajeshanthari.college.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Passport {
	@Id
	@GenericGenerator(name = "rajesh_uuid", strategy = "uuid2")
	@GeneratedValue(generator = "rajesh_uuid")
	private UUID id;
	private String number;
	
	@OneToOne(mappedBy = "passport")
	private Student student;

	public void copyPassport(Passport resource) {
		if (this.id == null) {
			this.id = resource.getId();
		}
		if (this.number == null) {
			this.number = resource.getNumber();
		}
	}

}
