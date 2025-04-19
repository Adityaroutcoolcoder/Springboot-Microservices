package com.aditya.pk3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentAddressController {

	private Student student;
	
	@Autowired
	public void setStudent(Student student) {
		this.student = student;
	}
	@RequestMapping("/student")
	public String getStudent() {
		return student.getStudent();
	}
}
