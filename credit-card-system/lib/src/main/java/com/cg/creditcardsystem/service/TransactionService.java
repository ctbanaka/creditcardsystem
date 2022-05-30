package com.cg.creditcardsystem.service;

import java.util.Date;
import java.util.List;

import com.cg.creditcardsystem.dto.TransactionDto;
import com.cg.creditcardsystem.entities.Transaction;

public interface TransactionService {
	long addTransaction(TransactionDto transdto);
	List<Transaction> viewAllTransactions();
	List<Transaction> viewTransactionsByDate(long cardNo, Date startDate, Date endDate);
	
		
	
	

}
