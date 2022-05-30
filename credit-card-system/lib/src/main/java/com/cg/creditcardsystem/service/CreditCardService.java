package com.cg.creditcardsystem.service;

import org.springframework.stereotype.Service;

import com.cg.creditcardsystem.dto.CreditCardDto;
import com.cg.creditcardsystem.entities.CreditCard;
import com.google.common.base.Optional;

import antlr.collections.List;
@Service
public interface CreditCardService {
	//long addCreditCard(CreditCardDto carddto);  
    public Optional<CreditCard> findAllActiveByUerId(int userid);
    public Optional<CreditCard> findById(int userid) ;
    public Optional<CreditCard> findActiveById(int userid);
    public boolean changeDailyLimit(CreditCard card) ;
    public boolean activate(int userid) ;
    public boolean deactivate(int userid); 
    
}

