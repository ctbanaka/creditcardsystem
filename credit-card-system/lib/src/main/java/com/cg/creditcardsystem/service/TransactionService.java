package com.cg.creditcardsystem.service;

import java.util.List;
import com.cg.creditcardsystem.dto.TransactionDto;
import com.cg.creditcardsystem.entities.Transaction;

public interface TransactionService {
	int addTransaction(TransactionDto transdto);
	List<TransactionDto> viewAllTransactions(long cardNo);
	TransactionDto viewTransactionById(int transactionId);


}
