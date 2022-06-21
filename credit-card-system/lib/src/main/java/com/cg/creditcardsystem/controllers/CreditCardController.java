package com.cg.creditcardsystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.creditcardsystem.dto.CreditCardDto;
import com.cg.creditcardsystem.entities.CreditCard;
import com.cg.creditcardsystem.service.CreditCardserviceImpl;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/card")
public class CreditCardController {
 @Autowired
 CreditCardserviceImpl service;

      
      @GetMapping("/id/{userId}")
      public ResponseEntity<CreditCard> getCardByUser(@PathVariable int userId){
    	  CreditCard card=service.getCardById(userId);
		return new ResponseEntity<CreditCard>(card,HttpStatus.OK);
    	  
      }
      
      @DeleteMapping("{cardNo}")
      public ResponseEntity<String>deleteCreditCard(@PathVariable long cardNo){
    	  service.deleteCreditCard(cardNo);
    	  return new ResponseEntity<String>("deleted",HttpStatus.OK);
      }
      
      
      
}




