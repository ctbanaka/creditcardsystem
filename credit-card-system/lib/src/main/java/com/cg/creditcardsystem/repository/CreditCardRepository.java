package com.cg.creditcardsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.creditcardsystem.entities.CreditCard;
@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {

 @Query(value="select card from CreditCard card where card.userId=?1")
 CreditCard getCardInfo(int userId);
 
 @Query(value="select card from CreditCard card where card.userId=?1")
 CreditCard getCardByuserId(int userId);







	
}


		

