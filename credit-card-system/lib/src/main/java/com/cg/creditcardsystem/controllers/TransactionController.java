package com.cg.creditcardsystem.controllers;

<<<<<<< HEAD
public class TransactionController {

=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.creditcardsystem.entities.Transaction;
import com.cg.creditcardsystem.service.TransactionServiceImpl;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
   @Autowired
   TransactionServiceImpl transservice;
   
   @PostMapping
   public ResponseEntity<String> addTransaction(@RequestBody Transaction trans){
	   transservice.addTransaction(trans);
	return new ResponseEntity<String>("inserted", HttpStatus.OK);
	
   }
   
>>>>>>> 2a84f2e46b4d3ab4851bf5d906b9b84d73f24232
}
