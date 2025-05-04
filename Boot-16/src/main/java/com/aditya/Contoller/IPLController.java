package com.aditya.Contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class IPLController {
	
	private IPL ipl;

	@Autowired
	public IPLController(IPL ipl) {
		this.ipl = ipl;
	}
	
	public String getIPL() {
		return ipl.getIPL();
	}
}
