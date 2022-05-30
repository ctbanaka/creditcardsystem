package com.cg.creditcardsystem.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.cg.creditcardsystem.dto.TransactionDto;
import com.cg.creditcardsystem.entities.Transaction;

public interface TransactionService {
	long addTransaction(TransactionDto transdto);
	List<Transaction> viewAllTransactions(long cardNo);
	Optional<List<Transaction>> viewTransactionsByDates(long cardNo, Date startDate, Date endDate);
	Optional<Transaction> viewTransactionById(long transactionId);
	
	

}
