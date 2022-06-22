package com.cg.creditcardsystem.dto;

import java.util.Date;

import com.cg.creditcardsystem.entities.Registration;

public class CreditCardDto {

	private long cardNo;
	private String cardType;
	private Date expiryDate;
	private int cvv;
	private int userId;
	
	public long getCardNo() {
		return cardNo;
	}

	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
	this.userId=userId;
	}

	

	@Override
	public String toString() {
		return "CreditCardDto [cardNo=" + cardNo + ", cardType=" + cardType + ", expiryDate=" + expiryDate + ", cvv="
				+ cvv + ", userId=" + userId + "]";
	}

	
}
