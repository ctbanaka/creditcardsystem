package com.cg.creditcardsystem.controllers;


import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.creditcardsystem.dto.TransactionDto;
import com.cg.creditcardsystem.entities.Transaction;
import com.cg.creditcardsystem.service.TransactionServiceImpl;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
   @Autowired
   TransactionServiceImpl transservice;
   
   @PostMapping
   public ResponseEntity<String> addTransaction(@RequestBody TransactionDto transdto){
	   transservice.addTransaction(transdto);
	return new ResponseEntity<String>("transaction inserted", HttpStatus.OK);
	
   }
  
   @GetMapping("/cardno/{cardno}")
   public ResponseEntity<List<TransactionDto>> viewAllTransactions(@PathVariable long cardNo){
	  List<TransactionDto> translist= transservice.viewAllTransactions(cardNo);
	return new ResponseEntity<List<TransactionDto>>(translist,HttpStatus.OK);
	   
 }
//  
//   @GetMapping("/card/{bydate}")
//   public ResponseEntity<Optional<List<Transaction>>> viewTransactionsByDate(@PathVariable long cardNo, Date startDate,Date endDate){
//	  List<Transaction> translist= transservice.viewTransactionsByDates(cardNo,startDate, endDate);
//	return new ResponseEntity<Optional<List<Transaction>>>(HttpStatus.OK);
//	   
//   }
   
   @GetMapping("/card/{transactionid}")
   public ResponseEntity<Optional<Transaction>> viewTransactionById(long transactionId){
	   Optional<Transaction> trans=transservice.viewTransactionById(transactionId);
	return new ResponseEntity<Optional<Transaction>>(trans,HttpStatus.OK);
	   
   }
}
