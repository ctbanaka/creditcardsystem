package com.cg.creditcardsystem.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.creditcardsystem.entities.Registration;
import com.cg.creditcardsystem.service.RegistrationServiceImpl;

@RestController
@RequestMapping("/register")
public class RegistrationController {
     @Autowired
	 RegistrationServiceImpl service;
     
     
    @PostMapping
 	public ResponseEntity<String> addUser(@RequestBody Registration reg){
 		service.addUser(reg);
 		return new ResponseEntity<String>("user added", HttpStatus.OK);
 	}
}
