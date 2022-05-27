package com.cg.creditcardsystem.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.creditcardsystem.dto.TransactionDto;
import com.cg.creditcardsystem.entities.CreditCard;
import com.cg.creditcardsystem.entities.Transaction;
import com.cg.creditcardsystem.repository.CreditCardRepository;
import com.cg.creditcardsystem.repository.TransactionRepository;

public class TransactionServiceImpl implements TransactionService {
     @Autowired
     TransactionRepository transrepo;
     @Autowired
     CreditCardRepository  cardrepo;
	@Override
	public int addTransaction(TransactionDto transdto) {
		CreditCard card= cardrepo.getById(transdto.)
		return 1;
	}

	
	
	
}
