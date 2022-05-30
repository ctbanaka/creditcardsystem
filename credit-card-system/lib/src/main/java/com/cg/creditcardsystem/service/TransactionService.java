package com.cg.creditcardsystem.service;

import com.cg.creditcardsystem.dto.TransactionDto;
import com.cg.creditcardsystem.entities.Transaction;

public interface TransactionService {
	long addTransaction(TransactionDto transdto);
	public void displayTransactions();
	public void stopConnection();
	public void transactionsBycardoMonthYear(int cardno , int month, int year);
	public void numberAndTotalValueOfTransactionType(String transactionType);
	
	

}
