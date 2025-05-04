package com.aditya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aditya.component.ProjectLombok;

@SpringBootApplication
public class Boot18Application {
	
	private ProjectLombok projectLombok;
	
	public Boot18Application(ProjectLombok projectLombok) {
		this.projectLombok = projectLombok;
	}

    public static void main(String[] args) {
		var context = SpringApplication.run(Boot18Application.class, args);
		ProjectLombok p = context.getBean(ProjectLombok.class);
		p.setSRollno(01);
		p.setSName("Mayank Lenka");
		p.setSFathername("Prasanta Kumar Lenka");
		p.setSMothername("Jayashree Lenka");
		p.setSHomeaddress("Bypass,Bhadrak");
		p.setSSchooladdress("DAV,Randia,Bhadrak");
		System.out.println("Rollno::"+p.getSRollno());
		System.out.println("Name::"+p.getSName());
		System.out.println("FatherName::"+p.getSFathername());
		System.out.println("MotherName::"+p.getSMothername());
		System.out.println("HomeAddress::"+p.getSHomeaddress());
		System.out.println("SchoolAddress::"+p.getSSchooladdress());
		
    }
}
