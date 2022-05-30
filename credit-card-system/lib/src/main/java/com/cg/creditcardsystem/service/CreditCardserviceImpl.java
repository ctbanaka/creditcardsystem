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
	
<<<<<<< HEAD
//    @Autowired
//	CreditCardRepository cardrepo;
//    @Autowired
//    RegistrationRepository regrepo;
//	@Override
//	public Optional<CreditCard> findAllActiveByUerId(int userid) {
//		Optional<CreditCard> cred=cardrepo.findById(userid);
//		return cred;
//	
//	}
//	@Override
//	public Optional<CreditCard> findById(int userid) {
//		Optional<CreditCard> cred=cardrepo.findById(userid);
//		return cred;
//	}
//	@Override
//	public Optional<CreditCard> findActiveById(int userid) {
//		Optional<CreditCard> cred=cardrepo.findById(userid);
//		return cred;
//	
//	}
//	@Override
//	public boolean activate(int userid) {
//		
//		return false;
//	}
//	@Override
//	public boolean deactivate(int userid) {
//	
//		return false;	
//	}
//	@Override
//	public boolean changeDailyLimit(CreditCard card) {
//		Optional<CreditCard>cred=cardrepo.ChangeByCardno(card);
//		return false;
//	}
=======
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
	 
>>>>>>> edec6f5a6a12f441c01a81082ac2ce82454cbd95
}
//
//
//
//	