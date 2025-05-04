package com.aditya.Scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyScheduler {

//	@Scheduled(cron = "1 * * * * ?")
//	public void a1() {
//		//business logic	
//	}
	
	@Scheduled(fixedRate = 10000)
	public void a2() {
		System.out.println("You Have Qualified For Our Company As A Software Devloper..");
	}
	
	@Scheduled(fixedDelay = 1000,initialDelay = 4000)
	public void a3() {
		System.out.println("Hey Friends Can We Have A Trip To Maldives...");
	}
}
