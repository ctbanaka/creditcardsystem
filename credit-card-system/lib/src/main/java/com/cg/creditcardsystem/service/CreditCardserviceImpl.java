package com.cg.creditcardsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.creditcardsystem.dto.CreditCardDto;
import com.cg.creditcardsystem.entities.CreditCard;
import com.cg.creditcardsystem.entities.Registration;
import com.cg.creditcardsystem.repository.CreditCardRepository;
import com.cg.creditcardsystem.repository.RegistrationRepository;
import com.google.common.base.Optional;

import antlr.collections.List;
@Service
public class CreditCardserviceImpl implements CreditCardService{
	
    @Autowired
	CreditCardRepository cardrepo;
    @Autowired
    RegistrationRepository regrepo;
	@Override
	public long addCreditCard(CreditCardDto carddto) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public java.util.List<CreditCard> viewAllCards() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteCard(long cardNo) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public java.util.Optional<CreditCard> getCardById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
	 
}



	