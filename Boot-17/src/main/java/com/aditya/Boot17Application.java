package com.aditya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Boot17Application {

	public static void main(String[] args) {
		SpringApplication.run(Boot17Application.class, args);
	}

}
