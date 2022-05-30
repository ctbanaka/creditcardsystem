package com.cg.creditcardsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cg.creditcardsystem.dto.CreditCardDto;
import com.cg.creditcardsystem.entities.CreditCard;



@Service
public interface CreditCardService {
<<<<<<< HEAD
	 
=======
	long addCreditCard(CreditCardDto carddto);  
    List<CreditCard> viewAllCards();
    void deleteCard(long cardNo );
    Optional<CreditCard> getCardById(int userId);
    
>>>>>>> edec6f5a6a12f441c01a81082ac2ce82454cbd95
}

