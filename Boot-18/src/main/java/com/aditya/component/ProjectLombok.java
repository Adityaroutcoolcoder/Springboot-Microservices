package com.aditya.component;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Component
@Data

public class ProjectLombok {

	int sRollno;
	String sName;
	String sFathername;
	String sMothername;
    String sHomeaddress;
    String sSchooladdress;
    
}