package com.cg.creditcardsystem.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.cg.creditcardsystem.dto.CreditCardDto;
import com.cg.creditcardsystem.dto.TransactionDto;
import com.cg.creditcardsystem.entities.CreditCard;

@Service
public interface CreditCardService {

	long addCreditCard(CreditCardDto carddto);  
    List<CreditCardDto> viewAllCards();
    void deleteCreditCard(long cardNo);
    CreditCardDto viewCreditCardById(int userId);
    

}

