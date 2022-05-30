package com.cg.creditcardsystem.service;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.creditcardsystem.dto.CreditCardDto;
import com.cg.creditcardsystem.entities.CreditCard;
import com.cg.creditcardsystem.entities.Registration;
import com.cg.creditcardsystem.repository.CreditCardRepository;
import com.cg.creditcardsystem.repository.RegistrationRepository;
<<<<<<< HEAD
=======

>>>>>>> 2cd43a77538262f9ad0937f79719ce51477003ef
@Service
public class CreditCardserviceImpl implements CreditCardService{

    @Autowired
	CreditCardRepository cardrepo;
    @Autowired
    RegistrationRepository regrepo;
	@Override
	public long addCreditCard(CreditCardDto carddto) {
		Registration reg= regrepo.getById(carddto.getUserId());
		CreditCard card=new CreditCard();
		card.setCardNo(carddto.getCardNo());
		card.setCardType(carddto.getCardType());
		card.setCreditLimit(card.getCreditLimit());
		card.setCvv(carddto.getCvv());
		card.setExpiryDate(carddto.getExpiryDate());
		cardrepo.save(card);
		return card.getCardNo();
		
	
	}
	@Override
	public java.util.List<CreditCard> viewAllCards() {
		
		return null;
	}
	@Override
	public void deleteCard(long cardNo) {
		cardrepo.deleteById(cardNo);
		
	}
	@Override
	public java.util.Optional<CreditCard> getCardById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
}