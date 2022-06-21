package com.cg.creditcardsystem.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.creditcardsystem.dto.TransactionDto;
import com.cg.creditcardsystem.entities.CreditCard;
import com.cg.creditcardsystem.entities.Transaction;
import com.cg.creditcardsystem.exceptions.CardNotFoundException;
import com.cg.creditcardsystem.exceptions.InvalidCardDetailsException;
import com.cg.creditcardsystem.exceptions.InvalidTransactionIdException;
import com.cg.creditcardsystem.repository.CreditCardRepository;
import com.cg.creditcardsystem.repository.TransactionRepository;
@Service
public class TransactionServiceImpl implements TransactionService {
     @Autowired
     TransactionRepository transrepo;
     @Autowired
     CreditCardRepository  cardrepo;
	@Override
	public int addTransaction(TransactionDto transdto) {
    	CreditCard card= cardrepo.getById(transdto.getCardNo());
		Transaction transaction=new Transaction();
		transaction.setCard(card);
		transaction.setDescription(transdto.getDescription());
		transaction.setDebitedBalance(transdto.getDebitedBalance());
		transaction.setTransactionDate(transdto.getTransactionDate());
		transaction.setRedeemPoints(transdto.getRedeemPoints());
	    transrepo.save(transaction);
		return transaction.getTransactionId();
	}
	@Override
	public List<TransactionDto> viewAllTransactions(long cardNo) {
		CreditCard card=cardrepo.getById(cardNo);
		if(card==null) {
			throw new CardNotFoundException();
		}
		else if(!(card.getCardNo()==cardNo)) {
		throw new InvalidCardDetailsException();
		}
		List<Transaction> translist= transrepo.getTransactionsByCardNo(cardNo);
		List<TransactionDto> translistdto= new ArrayList<TransactionDto>();
		for(Transaction trans:translist) {
			TransactionDto transdto=new TransactionDto();
			transdto.setCardNo(trans.getCard().getCardNo());
			transdto.setDebitedBalance(trans.getDebitedBalance());
			transdto.setDescription(trans.getDescription());
			transdto.setTransactionDate(trans.getTransactionDate());
			transdto.setRedeemPoints(trans.getRedeemPoints());
			translistdto.add(transdto);
		}
		return translistdto;
	 
	}

	@Override
	public Transaction viewTransactionById(int transactionId) {
		Transaction transaction=transrepo.getTransactionById(transactionId);
		if(transaction==null || !(transaction.getTransactionId()==transactionId))
			throw new InvalidTransactionIdException();
		
		
		return transaction;
	}

 
	
}
