package com.cg.creditcardsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.creditcardsystem.entities.CreditCard;

public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {

 @Query(value="select card from CreditCard card where card.userId=?1")
 CreditCard getCardInfo(int userId);
 
 @Query(value="select card.cardNo from CreditCard card where card.cardNo=?1")
 CreditCard getCardByCardNo(long cardNo);
		
}
