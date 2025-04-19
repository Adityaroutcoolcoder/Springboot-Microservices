package com.aditya.pk3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

	private Address address;
	
	@Autowired
	public void setAddress(Address address) {
		this.address=address;
	}
	public String getStudent() {
		return"Aditya Rout,Biet,Computer Science,61000.0"
				+"----"+address.getAddress();
	}
}
