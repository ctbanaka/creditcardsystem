package com.cg.creditcardsystem.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.creditcardsystem.dto.TransactionDto;
import com.cg.creditcardsystem.entities.Transaction;
import com.cg.creditcardsystem.repository.CreditCardRepository;
import com.cg.creditcardsystem.repository.TransactionRepository;
import com.cg.creditcardsystem.service.TransactionService;
import com.cg.creditcardsystem.service.TransactionServiceImpl;

@SpringBootTest
 class TransactionDaoTest {
	@Autowired
    TransactionRepository transrepo;
    @Autowired
    CreditCardRepository  cardrepo;
    @Autowired
    TransactionService service= new TransactionServiceImpl(); 
		
		 
     @Test
     void testAddTransaction() {
    	 TransactionDto transdto= new TransactionDto();
    	 transdto.setCardNo(1234567891234567L);
    	 transdto.setDebitedBalance(2000);
    	 transdto.setDescription("shopping");
    	 transdto.setRedeemPoints(100);
    	 transdto.setTransactionDate(new Date());
    	 
    	 int transactionid = service.addTransaction(transdto);
    	 Transaction  trans=transrepo.getTransactionById(transactionid);
    	 assertEquals(transactionid, trans.getTransactionId());
     }
     @Test
     void testViewTransactionById() {
    	 transrepo.getTransactionById(1000000019);
    	 Transaction trans= service.viewTransactionById(1000000019);
    	 assertNotNull(trans);
     }
    }
