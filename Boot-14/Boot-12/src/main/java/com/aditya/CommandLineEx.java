package com.aditya;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineEx implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("HelloWorld From CommandLineRunner...");
		if(args.length>0) {
			System.out.println("Argument Has Been Passed...");
			for(String arg:args) {
				System.out.println(arg);
			}
		}
	}
}
