package com.aditya;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineEx2 implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
	
		if(args.length>0) {
			
			for(String arg:args) {
				System.out.println(arg);
	}
		}
}
}