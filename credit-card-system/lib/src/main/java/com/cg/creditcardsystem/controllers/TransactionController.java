package com.cg.creditcardsystem.controllers;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.creditcardsystem.dto.TransactionDateDto;
import com.cg.creditcardsystem.dto.TransactionDto;
import com.cg.creditcardsystem.service.TransactionServiceImpl;
import com.cg.creditcardsystem.utils.ApiResponse;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/transaction")
public class TransactionController {
   @Autowired
   TransactionServiceImpl transservice;
   
   @PostMapping
   public ResponseEntity<ApiResponse> addTransaction(@RequestBody TransactionDto transdto){
	   ApiResponse response=new ApiResponse();
	   response.setMessage("paid successfully");
	   transservice.addTransaction(transdto);
	return new ResponseEntity<ApiResponse>(response, HttpStatus.OK);
	
   }
  
   @GetMapping("/{cardNo}")
   public ResponseEntity<List<TransactionDto>> viewAllTransactions(@PathVariable long cardNo){
	  List<TransactionDto> translist= transservice.viewAllTransactions(cardNo);
	return new ResponseEntity<List<TransactionDto>>(translist,HttpStatus.OK);
	   
 }

   @GetMapping("/card/{transactionId}")
   public ResponseEntity <TransactionDto> viewTransactionById(@ PathVariable int transactionId){
	   TransactionDto trans=transservice.viewTransactionById(transactionId);
	return new ResponseEntity<TransactionDto>(trans,HttpStatus.OK);
	   
   }
 
}
