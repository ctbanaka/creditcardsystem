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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.creditcardsystem.dto.AddressDto;
import com.cg.creditcardsystem.entities.Address;
import com.cg.creditcardsystem.service.AddressServiceImpl;
@CrossOrigin(origins = "*", maxAge = 3600)
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
   public ResponseEntity<List<AddressDto>> getAllAddress(){
	   @SuppressWarnings("unused")
	List<AddressDto> addrlist= addrservice.viewAllAddress();
	   return new ResponseEntity<List<AddressDto>>(addrlist,HttpStatus.OK);
   }

   @GetMapping("/id/{userId}")
   public ResponseEntity<Address> getAddressByUser(int userId){
	   Address address= addrservice.getAddress(userId);
	return new ResponseEntity<Address>(address,HttpStatus.OK);
	   
   }
   
   @DeleteMapping("{addressId}")
   public ResponseEntity<String> deleteAddress(@PathVariable int addressId){
   	addrservice.deleteAddressById(addressId);
   	return new ResponseEntity<String>("deleted",HttpStatus.OK);
   }
   @PutMapping
   public ResponseEntity<String> editAddress(@RequestBody AddressDto addr ){
   	addrservice.updateAddress(addr);
   	return new ResponseEntity<String>("updated",HttpStatus.OK);
   }
}
