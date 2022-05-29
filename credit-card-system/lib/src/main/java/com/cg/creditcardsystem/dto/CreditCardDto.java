package com.cg.creditcardsystem.dto;

import java.util.Date;

public class CreditCardDto {
	private long cardNo;
	private String cardType;
	private Date expiryDate;
	private int cvv;
	private int userId;
	private double creditLimit;
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
		this.userId = userId;
	}
	 
	public long getCardNo() {
		return cardNo;
	}
	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	@Override
	public String toString() {
		return "CreditCardDto [cardNo=" + cardNo + ", cardType=" + cardType + ", expiryDate=" + expiryDate + ", cvv="
				+ cvv + ", userId=" + userId + ", creditLimit=" + creditLimit + "]";
	}
	
}
