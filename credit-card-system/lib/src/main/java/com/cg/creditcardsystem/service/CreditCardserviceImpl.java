package com.cg.creditcardsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.creditcardsystem.dto.CreditCardDto;
import com.cg.creditcardsystem.entities.CreditCard;
import com.cg.creditcardsystem.entities.Registration;
import com.cg.creditcardsystem.repository.CreditCardRepository;
import com.cg.creditcardsystem.repository.RegistrationRepository;

import antlr.collections.List;
@Service
public class CreditCardserviceImpl implements CreditCardService{
	
    @Autowired
	CreditCardRepository cardrepo;
    @Autowired
    RegistrationRepository regrepo;
	@Override
	public List findAllActiveByUerId(int userid) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public CreditCard findById(int userid) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public CreditCard findActiveById(int userid) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean changeDailyLimit(CreditCard card) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean activate(int userid) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deactivate(int userid) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
    
	@Override
	public long addCreditCard(CreditCardDto carddto) {
		Registration reg= regrepo.getById(carddto.getUserId());
		CreditCard card= new CreditCard();
		card.setUserid(reg);
		card.setCardNo(carddto.getCardNo());
		card.setCardType(carddto.getCardType());
		card.setCreditLimit(carddto.getCreditLimit());
		card.setCvv(carddto.getCvv());
		card.setExpiryDate(carddto.getExpiryDate());
		cardrepo.save(card);
		return card.getCardNo();//
		
		
	}
}



	