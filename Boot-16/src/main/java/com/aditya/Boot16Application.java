package com.aditya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aditya.Contoller.IPLController;

@SpringBootApplication
public class Boot16Application {

	public static void main(String[] args) {
		var context=SpringApplication.run(Boot16Application.class, args);
		IPLController iplController = context.getBean(IPLController.class);
		System.out.println(iplController.getIPL());
	}

}
