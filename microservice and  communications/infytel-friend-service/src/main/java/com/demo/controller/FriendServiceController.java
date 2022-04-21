package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.delegate.FriendServiceDelegate;



@RestController
public class FriendServiceController {
	
	@Autowired
	FriendServiceDelegate friendServiceDelegate;

	@RequestMapping(value = "/getFamilyDetails/{familyname}", method = RequestMethod.GET)
	public String getStudents(@PathVariable String familyname) {
		System.out.println("Going to call student service to get data!");
		return friendServiceDelegate.callFriendServiceAndGetData(familyname);
	}

	
}
