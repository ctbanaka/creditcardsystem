package com.cg.creditcardsystem.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.cg.creditcardsystem.dto.TransactionDto;
import com.cg.creditcardsystem.entities.Transaction;

public interface TransactionService {
	long addTransaction(TransactionDto transdto);
	List<TransactionDto> viewAllTransactions(long cardNo);
	Optional<Transaction> viewTransactionById(long transactionId);
	//List<Transaction> viewTransactionsByDates(long cardNo, Date startDate, Date endDate);

}
