package com.aditya.Contoller;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MIFanOfficialy implements IPL {

	@Override
	public String getIPL() {
		return "Hii I Am A Fan Of Mumbai Indians....";
	}

}
