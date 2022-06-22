package com.cg.creditcardsystem.service;





import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.creditcardsystem.dto.CreditCardDto;
import com.cg.creditcardsystem.entities.CreditCard;
import com.cg.creditcardsystem.entities.Registration;
import com.cg.creditcardsystem.exceptions.InvalidCardDetailsException;
import com.cg.creditcardsystem.exceptions.InvalidTransactionIdException;
import com.cg.creditcardsystem.repository.CreditCardRepository;
import com.cg.creditcardsystem.repository.RegistrationRepository;

@Service
public class CreditCardserviceImpl implements CreditCardService{

    @Autowired
	CreditCardRepository cardrepo;
    @Autowired
    RegistrationRepository regrepo;
	@Override
	public long addCreditCard(CreditCardDto carddto) {
		Registration reg= regrepo.getById(carddto.getUserId());
		if(reg==null)
			throw new InvalidCardDetailsException();
		CreditCard card=new CreditCard();
		card.setCardNo(carddto.getCardNo());
		card.setCardType(carddto.getCardType());
		card.setCvv(carddto.getCvv());
		card.setExpiryDate(carddto.getExpiryDate());
		cardrepo.save(card);
		return card.getCardNo();
			
	}

	@Override
	public void deleteCreditCard(long cardNo) {
		cardrepo.deleteById(cardNo);;
		
	}
	

	@Override
	public List<CreditCardDto> viewAllCards() {
		List<CreditCard> creditcardlist =cardrepo.findAll();
		ArrayList<CreditCardDto> creditcardDtoList=new ArrayList<>();
		for(CreditCard creditcard : creditcardlist) {
			CreditCardDto creditcarddto = new CreditCardDto();
			creditcarddto.setCardNo(creditcard.getCardNo());
			creditcarddto.setCardType(creditcard.getCardType());
			creditcarddto.setCvv(creditcard.getCvv());
			creditcarddto.setExpiryDate(creditcard.getExpiryDate());
			
			creditcardDtoList.add(creditcarddto);
			
            }
		return creditcardDtoList;
  }

	@Override
	public CreditCardDto viewCreditCardByCardNo(long cardNo) {
		CreditCard creditcard=cardrepo.getCardBycardNo(cardNo);
		
		  CreditCardDto cardDto= new CreditCardDto();
		   cardDto.setCardNo(creditcard.getCardNo());
		   cardDto.setCardType(creditcard.getCardType());
		   cardDto.setCvv(creditcard.getCvv());
		   cardDto.setExpiryDate(creditcard.getExpiryDate());
		 // cardDto.setUserId(creditcard.getUserId());
		    return cardDto;
	
	}

	
 }
	
	
	
	
	