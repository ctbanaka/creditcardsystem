package com.cg.creditcardsystem.dto;

import java.util.Date;

import javax.persistence.Column;

public class TransactionDto {
	private long transactionId;
    private Date transactionDate;
    private String transactionType;
    private double debitedBalance;
    private double availableBalance;
    private int redeemPoints;
    
	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public double getDebitedBalance() {
		return debitedBalance;
	}
	public void setDebitedBalance(double debitedBalance) {
		this.debitedBalance = debitedBalance;
	}
	public double getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}
	public int getRedeemPoints() {
		return redeemPoints;
	}
	public void setRedeemPoints(int redeemPoints) {
		this.redeemPoints = redeemPoints;
	}
	@Override
	public String toString() {
		return "TransactionDto [transactionId=" + transactionId + ", transactionDate=" + transactionDate
				+ ", transactionType=" + transactionType + ", debitedBalance=" + debitedBalance + ", availableBalance="
				+ availableBalance + ", redeemPoints=" + redeemPoints + "]";
	}
	
}
	
    

