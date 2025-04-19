package com.aditya.pkg1;

import org.springframework.stereotype.Component;

@Component
public class A {
	
	public A() {
		System.out.println("Hii Boys...");
	}
	public static void main(String[] args) {
		A a = new A();
		
	}
}
