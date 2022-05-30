package com.cg.creditcardsystem.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RegistrationExceptionHandler {
	@ExceptionHandler(value=UserNotFoundException.class)
	public  ResponseEntity<Object> exception(UserNotFoundException exception){
		return new ResponseEntity<Object>("User not found...",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value=UserAlreadyExistException.class)
	public ResponseEntity<Object> exception(UserAlreadyExistException exception){
		return new ResponseEntity<Object>("user Already Exists...",HttpStatus.NOT_FOUND);
	}
}
