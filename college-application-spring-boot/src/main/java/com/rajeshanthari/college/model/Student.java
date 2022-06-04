package com.rajeshanthari.college.model;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

	@Id
	@GenericGenerator(name = "rajesh_uuid", strategy = "uuid2")
	@GeneratedValue(generator = "rajesh_uuid")
	private UUID id;
	private String name;
	private String section;
	@Embedded
	private Address address;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Passport passport;

	public void copyStudent(Student student) {
		if (this.id == null) {
			this.id = student.getId();
		}
		if (this.name == null) {
			this.name = student.getName();
		}
		if (this.section == null) {
			this.section = student.getSection();
		}
		if (this.address == null) {
			this.address = student.getAddress();
		} else {
			this.address.copyAddress(student.getAddress());
		}

		if (this.passport == null) {
			this.passport = student.getPassport();
		} else {
			this.passport.copyPassport(student.getPassport());
		}
	}

}
