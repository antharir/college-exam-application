package com.rajeshanthari.college.model;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address {
	private String address1;
	private String address2;
	private String city;
	private Integer pincode;

	public void copyAddress(Address address) {

		if (this.address1 == null) {
			this.address1 = address.getAddress1();
		}
		if (this.address2 == null) {
			this.address2 = address.getAddress2();
		}
		if (this.city == null) {
			this.city = address.getCity();
		}
		if (this.pincode == null) {
			this.pincode = address.getPincode();
		}

	}
}
