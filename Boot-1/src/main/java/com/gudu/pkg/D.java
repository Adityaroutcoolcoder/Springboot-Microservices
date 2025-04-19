package com.gudu.pkg;

import org.springframework.stereotype.Controller;

@Controller
public class D {
	
	public D() {
		System.out.println("Hello Buddy...");
	}
	public static void main(String[] args) {
		D d = new D();
    }
}