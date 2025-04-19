package com.aditya.pkg2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FF {
	
	@RequestMapping("/game")
	public String Game() {
		return"Free Fire Lunched In World Since 2019";
	}
	@RequestMapping("/play")
	public String Play() {
		return"It Play For Time pass";
	}


}
