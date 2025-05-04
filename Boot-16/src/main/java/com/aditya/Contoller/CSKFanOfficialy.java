package com.aditya.Contoller;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class CSKFanOfficialy implements IPL {

	@Override
	public String getIPL() {
		return "Hii I Am A Fan Of Chennai Super King....";
	}

}
