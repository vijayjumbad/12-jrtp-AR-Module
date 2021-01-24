package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.entity.UserRegistration;
import com.ashokit.service.UserRegistrationServiceMgmt;


@RestController
public class ApplicationRegistrationController {
	@Autowired
	private UserRegistrationServiceMgmt service;
	
	@PostMapping("/userReg")
	public ResponseEntity<String> addUser(@RequestBody UserRegistration user)
	{
		String saveUser = service.saveUser(user);
		if(saveUser!=null)
		return new ResponseEntity<String>(saveUser, HttpStatus.CREATED);
	else 
		return new ResponseEntity<String>("user registration failed..! invalid ssn", HttpStatus.BAD_REQUEST);
	
	}
	
}


