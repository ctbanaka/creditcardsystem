package com.cg.creditcardsystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.creditcardsystem.dto.AddressDto;
import com.cg.creditcardsystem.service.AddressServiceImpl;

@RestController
@RequestMapping("/address")
public class AddressController {
   @Autowired
   AddressServiceImpl addrservice;
   
   public ResponseEntity<String> addAddress(@RequestBody AddressDto addrdto){
	   int addressId= addrservice.addAddress(addrdto);
	   return new ResponseEntity<String>("added address="+addressId,HttpStatus.OK);
   }
}
