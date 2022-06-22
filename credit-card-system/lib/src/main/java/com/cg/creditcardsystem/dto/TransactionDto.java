package com.cg.creditcardsystem.dto;

import java.util.Date;


public class TransactionDto {
	private long cardNo;
    private Date transactionDate;
    private String description;
    private double debitedBalance;
    private double redeemPoints;
    
    
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
	public double getRedeemPoints() {
		return redeemPoints;
	}
	public void setRedeemPoints(double redeemPoints) {
		this.redeemPoints = redeemPoints;
	}
	@Override
	public String toString() {
		return "TransactionDto [cardNo=" + cardNo + ", transactionDate=" + transactionDate + ", description="
				+ description + ", debitedBalance=" + debitedBalance + ", redeemPoints=" + redeemPoints + "]";
	}
	 
	 
	 
	
 
	 
}
	
    

