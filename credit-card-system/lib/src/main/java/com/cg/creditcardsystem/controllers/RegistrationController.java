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

import com.cg.creditcardsystem.dto.RegistrationDto;
import com.cg.creditcardsystem.entities.Registration;
import com.cg.creditcardsystem.service.RegistrationServiceImpl;
import com.cg.creditcardsystem.utils.ApiResponse;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/register")
public class RegistrationController {
     @Autowired
	 RegistrationServiceImpl service;
     
     
    @PostMapping
 	public ResponseEntity<ApiResponse> userRegistration(@RequestBody Registration reg){
 		int userid=service.addUser(reg);
 		 ApiResponse response=new ApiResponse();
 		 response.setMessage("registration success your id"+userid);
 		return new ResponseEntity<ApiResponse>(response, HttpStatus.OK);
 	}
    @GetMapping
    public ResponseEntity<List<RegistrationDto>> getAllRegistration(){
    	List<RegistrationDto> reglist = service.viewAllUserDetails();
    	return new ResponseEntity<List<RegistrationDto>>(reglist,HttpStatus.OK);
    }
    @DeleteMapping("/{userId}")
    public ResponseEntity<String> deleteRegistration(@PathVariable int userId){
    	service.deleteUser(userId);
    	return new ResponseEntity<String>("deleted",HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<String> editRegistration(@RequestBody Registration reg){
    	service.updateUserDetails(reg);
    	return new ResponseEntity<String>("updated",HttpStatus.OK);
    }
}
