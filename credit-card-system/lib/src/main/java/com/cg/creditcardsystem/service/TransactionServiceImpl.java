package com.cg.creditcardsystem.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.creditcardsystem.dto.TransactionDto;
import com.cg.creditcardsystem.entities.Transaction;
import com.cg.creditcardsystem.repository.CreditCardRepository;
import com.cg.creditcardsystem.repository.TransactionRepository;

public class TransactionServiceImpl implements TransactionService {
     @Autowired
     TransactionRepository transrepo;
     @Autowired
     CreditCardRepository  credrepo;
	@Override
	public void addTransaction(Transaction transd) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
