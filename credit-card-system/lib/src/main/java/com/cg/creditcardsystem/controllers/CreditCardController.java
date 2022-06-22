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

      
      @GetMapping("/card/{cardNo}")
      public ResponseEntity<CreditCardDto> getCardByCardNo(@PathVariable long cardNo){
    	  CreditCardDto cardDto=service.viewCreditCardByCardNo(cardNo);
		return new ResponseEntity<CreditCardDto>(cardDto,HttpStatus.OK);
    	  
      }
      
     
      
      
      
}




