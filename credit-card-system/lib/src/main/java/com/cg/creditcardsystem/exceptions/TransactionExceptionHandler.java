package com.cg.creditcardsystem.exceptions;

import javax.transaction.InvalidTransactionException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class TransactionExceptionHandler {
	@ExceptionHandler(value=InvalidTransactionException.class)
	public  ResponseEntity<Object> exception(InvalidTransactionException exception){
		return new ResponseEntity<Object>("User not found...",HttpStatus.NOT_FOUND);
	}
}
