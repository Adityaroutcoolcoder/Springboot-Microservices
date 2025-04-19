package com.aditya.pkg1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class A1 {
	
	@RequestMapping("/adi")
	public String wish() {
		return"Happy BirthDay Bapu Bhai...";
		}
	@RequestMapping("/party")
    public String party() {
		return"God Bless You..";

  }
}