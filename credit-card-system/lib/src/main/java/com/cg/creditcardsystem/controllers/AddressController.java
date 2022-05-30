package com.cg.creditcardsystem.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.creditcardsystem.dto.AddressDto;
import com.cg.creditcardsystem.entities.Address;
import com.cg.creditcardsystem.entities.Registration;
import com.cg.creditcardsystem.service.AddressServiceImpl;

@RestController
@RequestMapping("/address")
public class AddressController {
   @Autowired
   AddressServiceImpl addrservice;
   @PostMapping
   public ResponseEntity<String> addAddress(@RequestBody AddressDto addrdto){
	   int addressId= addrservice.addAddress(addrdto);
	   return new ResponseEntity<String>("added address="+addressId,HttpStatus.OK);
   }

	@GetMapping
	public ResponseEntity<List<Address>> getAllAddress() {
		List<Address> adrsList = addrservice.viewAllAddress();
		return new ResponseEntity<List<Address>>(adrsList,HttpStatus.OK);
   }
    @DeleteMapping("/id/{address_id}")
    public ResponseEntity<String> deleteAddress(@PathVariable int address_id){
    	addrservice.deleteAddress(address_id);
    	return new ResponseEntity<String>("deleted",HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<String> editAddress(@RequestBody Address adrs){
    	addrservice.updateAddress(adrs);
    	return new ResponseEntity<String>("updated",HttpStatus.OK);
    }
}