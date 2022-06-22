package com.cg.creditcardsystem.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.creditcardsystem.dto.CreditCardDto;
import com.cg.creditcardsystem.service.CreditCardserviceImpl;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	 CreditCardserviceImpl service;
	 
	      @PostMapping
	       public ResponseEntity<String> createCreditCard(@RequestBody CreditCardDto carddto){
		   long cardNo= service.addCreditCard(carddto);
		   return new ResponseEntity<String>("added card="+cardNo,HttpStatus.OK);
	      }
	      @GetMapping
	      public ResponseEntity<List<CreditCardDto>>getAllcards(){
	    	  List<CreditCardDto> card=service.viewAllCards();
	    	  return new ResponseEntity<List<CreditCardDto>>(card,HttpStatus.OK);
}
	      @DeleteMapping("{cardNo}")
	      public ResponseEntity<String>deleteCreditCard(@PathVariable long cardNo){
	    	  service.deleteCreditCard(cardNo);
	    	  return new ResponseEntity<String>("deleted"+cardNo,HttpStatus.OK);
	      }
	     	      
}
