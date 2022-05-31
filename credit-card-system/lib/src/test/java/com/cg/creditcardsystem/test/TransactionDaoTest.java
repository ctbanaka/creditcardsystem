package com.cg.creditcardsystem.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.creditcardsystem.entities.Transaction;
import com.cg.creditcardsystem.repository.CreditCardRepository;
import com.cg.creditcardsystem.repository.TransactionRepository;

@SpringBootTest
public class TransactionDaoTest {
	@Autowired
    TransactionRepository transrepo;
    @Autowired
    CreditCardRepository  cardrepo;
    
     void testAddTransaction() {
    	 Transaction transaction=new Transaction();
    	 transaction.setCardNo(1234567891234567);
    	 
     }
}
