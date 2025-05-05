package com.aditya.component1;

import org.springframework.stereotype.Component;

@Component
public class Class {

	int age;
	String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		Class c = new Class();
		c.setAge(1);
		c.setName("adi");
		System.out.println(c.getAge());
		System.out.println(c.getName());
	}
	
}
