package com.aditya.adityafriends;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Study {

	@Autowired
	private Friend friend;
	
//	@Autowired
//	public Study(Friend friend) {
//		super();
//		this.friend = friend;
//	}
	
//	@Autowired
//	public void setFriend(Friend friend) {
//		this.friend=friend;
//		
//	}
	public String getStudy() {
		return "Btech-Electrical,+3 Science,Btech-Cse,Nursing"
				+"------"+friend.getFriend();
		
	}
}
