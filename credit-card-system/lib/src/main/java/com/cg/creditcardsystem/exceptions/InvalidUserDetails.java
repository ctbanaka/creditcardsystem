package com.cg.creditcardsystem.exceptions;

public class InvalidUserDetails extends RuntimeException {
   InvalidUserDetails(String message){
	   super(message);
   }
}
