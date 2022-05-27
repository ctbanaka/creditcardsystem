package com.cg.creditcardsystem.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.creditcardsystem.dto.TransactionDto;
import com.cg.creditcardsystem.entities.Transaction;
import com.cg.creditcardsystem.service.TransactionServiceImpl;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
   @Autowired
   TransactionServiceImpl transservice;
   
   @PostMapping
   public ResponseEntity<String> addTransaction(@RequestBody TransactionDto transdto){
	   transservice.addTransaction(transdto);
	return new ResponseEntity<String>("transaction inserted", HttpStatus.OK);
	
   }

}
