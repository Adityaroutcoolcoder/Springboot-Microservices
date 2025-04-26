package com.aditya.friendsdetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Friend {

	private Location location;
	
	@Autowired
	public void setLocation(Location location) {
		this.location=location;
	}
	public String getFriend() {
		String f1name = "Gudu";
		String f2name = "Bibek";
		String f3name = "Dibya";
		String f4name = "Sudhansu";
		String f5name = "Gyana";
        return "Friends Name --> "+f1name+","+f2name+","+f3name+","+f4name+","+f5name+""
        		+ "*****"+location.getLocation();
	}
}
