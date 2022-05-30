package com.cg.creditcardsystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.creditcardsystem.dto.CreditCardDto;
import com.cg.creditcardsystem.entities.CreditCard;
import com.cg.creditcardsystem.service.CreditCardserviceImpl;

@RestController
@RequestMapping("/card")
public class CreditCardController {
 @Autowired
 CreditCardserviceImpl service;
 
      @PostMapping
       public ResponseEntity<String> addCreditCard(@RequestBody CreditCardDto carddto){
	   long cardNo= service.addCreditCard(carddto);
	   return new ResponseEntity<String>("added card="+cardNo,HttpStatus.OK);
 }
      @GetMapping
      public ResponseEntity<List<CreditCard>>getAllcards(){
    	  List<CreditCard> card=service.viewAllCards();
    	  return new ResponseEntity<List<CreditCard>>(card,HttpStatus.OK);
    	  
      }
      @DeleteMapping
      public ResponseEntity<String>deleteCreditCared(@PathVariable int card){
    	  return new ResponseEntity<String>("delete",HttpStatus.OK);
      }
      
}




