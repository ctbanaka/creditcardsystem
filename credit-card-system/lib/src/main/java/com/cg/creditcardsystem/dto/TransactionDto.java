package com.cg.creditcardsystem.dto;

import java.util.Date;

import javax.persistence.Column;

import com.cg.creditcardsystem.entities.CreditCard;

public class TransactionDto {
	private long cardNo;
    private Date transactionDate;
    private String description;
    private double debitedBalance;
    private int redeemPoints;
    
    
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public double getDebitedBalance() {
		return debitedBalance;
	}
	public void setDebitedBalance(double debitedBalance) {
		this.debitedBalance = debitedBalance;
	}
	 
	public int getRedeemPoints() {
		return redeemPoints;
	}
	public void setRedeemPoints(int redeemPoints) {
		this.redeemPoints = redeemPoints;
	}
	
	public long getCardNo() {
		return cardNo;
	}

	public String getDescription() {
		return description;
	}
	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "TransactionDto [cardNo=" + cardNo + ", transactionDate=" + transactionDate + ", description="
				+ description + ", debitedBalance=" + debitedBalance + ", redeemPoints=" + redeemPoints + "]";
	}
	 
	
 
	 
}
	
    

