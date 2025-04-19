package com.aditya.pkg2;

import org.springframework.stereotype.Repository;

@Repository
public class C {

	public C () {
		System.out.println("Play Cricket...");
	}
	public static void main(String[] args) {
		C c = new C();
	}
}
