package com.aditya.friendsdetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FriendNameFriendLocationController {

	private Friend friend;

	@Autowired
	public void setFriend(Friend friend) {
		this.friend = friend;
	}
	@RequestMapping("/friend")
	public String getLocation() {
		return friend.getFriend();
	}
	
}
