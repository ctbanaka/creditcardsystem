package com.cg.creditcardsystem.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.creditcardsystem.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {

	@Query(value="select trans from Transaction trans where trans.transactiondate between ?1 and ?2 and trans.card_number=?3")
	List<Transaction> getTransactionByDate(Date startDate, Date endDate,long cardNo);

	//@Query(value="select trans from Transaction trans where trans.card_number=?1")
	//List<Transaction> getTransactionsByCardNo(long cardNo);
}
