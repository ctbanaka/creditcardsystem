package com.cg.creditcardsystem.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CreditCardExceptionHandler {
	@ExceptionHandler(value=CardNotFoundException.class)
  public ResponseEntity<Object> exception(CardNotFoundException exception){
	return new ResponseEntity<Object>("card not found..",HttpStatus.NOT_FOUND);
	  
  }
}
