package com.cg.creditcardsystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.cg.creditcardsystem.entities.Registration;
import com.cg.creditcardsystem.service.LogInServiceImpl;

public class LogInController {
    @Autowired
    LogInServiceImpl loginservice;
    
    
    public ResponseEntity<String> loginAsUser(Registration reg){
    	loginservice.addUserLogin(reg);
     return new ResponseEntity<String>("successfully logged in", HttpStatus.OK);
    }
    
}
