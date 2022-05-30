package com.cg.creditcardsystem.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.creditcardsystem.dto.TransactionDto;
import com.cg.creditcardsystem.entities.CreditCard;
import com.cg.creditcardsystem.entities.Transaction;
import com.cg.creditcardsystem.repository.CreditCardRepository;
import com.cg.creditcardsystem.repository.TransactionRepository;
@Service
public class TransactionServiceImpl implements TransactionService {
     @Autowired
     TransactionRepository transrepo;
     @Autowired
     CreditCardRepository  cardrepo;
	@Override
	public long addTransaction(TransactionDto transdto) {
		CreditCard card= cardrepo.getById(transdto.getCardNo());
		Transaction transaction=new Transaction();
		transaction.setCardNo(card);
		transaction.setDescription(transdto.getDescription());
		transaction.setDebitedBalance(transdto.getDebitedBalance());
		transaction.setTransactionDate(transdto.getTransactionDate());
		transaction.setRedeemPoints(transdto.getRedeemPoints());
	    transrepo.save(transaction);
		return transaction.getTransactionId();
	}
	@Override
	public List<Transaction> viewAllTransactions() {
		return transrepo.findAll();
	}
	@Override
	public List<Transaction> viewTransactionsByDate(long cardNo, Date startDate, Date endDate) {
	return transrepo.find;
	}
	 
	
}
