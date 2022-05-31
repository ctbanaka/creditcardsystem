package com.cg.creditcardsystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.creditcardsystem.dto.LogInDto;
import com.cg.creditcardsystem.entities.Registration;
import com.cg.creditcardsystem.service.LogInServiceImpl;
@RestController
@RequestMapping("/login")
public class LogInController {
    @Autowired
    LogInServiceImpl loginservice;
    
    @PostMapping
    public ResponseEntity<String> loginAsUser(LogInDto logindto){
    	loginservice.addUserLogin(logindto);
     return new ResponseEntity<String>("successfully logged in", HttpStatus.OK);
    }
    
}
