package com.cg.creditcardsystem.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class LoginExceptionHandler {
	

	@ExceptionHandler(value=InValidCredentialsException.class)
	  public ResponseEntity<Object> exception(InValidCredentialsException exception){
		return new ResponseEntity<Object>("invalid Credentials..please check",HttpStatus.NOT_FOUND);
 }
}
