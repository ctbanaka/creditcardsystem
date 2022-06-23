package com.cg.creditcardsystem.repository;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.creditcardsystem.entities.Transaction;
@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long> {

	@Query(value="select trans from Transaction trans where trans.card.cardNo=?1")
   List<Transaction> getTransactionByCardNo(long cardNo);
 
 
	
	@Query(value="select trans from Transaction trans where trans.transactionId=?1")
	Transaction getTransactionById(int transactionId);
	
 
}
   