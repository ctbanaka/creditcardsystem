package com.cg.creditcardsystem.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AddressExceptionHandler {
	@ExceptionHandler(value=AddressNotFoundExcetpion.class)
  public ResponseEntity<Object> exception(AddressNotFoundExcetpion exception){
	return new ResponseEntity<Object>("address not found..",HttpStatus.NOT_FOUND);
	  
  }
}