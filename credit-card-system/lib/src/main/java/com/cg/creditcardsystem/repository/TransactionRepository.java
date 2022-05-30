package com.cg.creditcardsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.creditcardsystem.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {

	@Query(value="select trans from Transaction trans where trans.date between ?1 and ?2 and trans.card_number=?3")
	Transaction getTransactionById(long transactionId);
}
