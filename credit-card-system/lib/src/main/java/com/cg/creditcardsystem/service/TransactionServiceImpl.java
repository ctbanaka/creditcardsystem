package com.cg.creditcardsystem.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.creditcardsystem.entities.Transaction;
import com.cg.creditcardsystem.repository.TransactionRepository;

public class TransactionServiceImpl implements TransactionService {
     @Autowired
     TransactionRepository transrepo;
	@Override
	public void addTransaction(Transaction trs) {
		transrepo.save(trs);
		
	}

}
