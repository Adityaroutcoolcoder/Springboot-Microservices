package com.aditya.friendsdetails;

import org.springframework.stereotype.Component;

@Component
public class Location {
	
	public String getLocation() {
	String v1name = "UttarBahini";
	String v2name = "Balipatana";
	String v3name = "Charampa";
	String v4name = "Knduapada";
	String v5name = "Haldidiha";
	return "Location-->"+v1name + ", " + v2name + ", " + v3name + ", " + v4name + ", " + v5name;
}
}