package com.aditya.adityafriends;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FriendStudyController {

	@Autowired
	private Study study;

//	@Autowired
//	public FriendStudyController(Study study) {
//		super();
//		this.study = study;
//	}
	
//  @Autowired
//	public void setStudy(Study study) {
//		this.study = study;
//    }
	
	@RequestMapping("/study")
	public String getStudy() {
		return study.getStudy();
	}
}
