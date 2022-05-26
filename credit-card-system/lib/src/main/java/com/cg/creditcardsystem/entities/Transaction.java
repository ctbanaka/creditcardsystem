package com.cg.creditcardsystem.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="transaction")
public class Transaction {
	
     @Id
     @SequenceGenerator(name="transactionid",initialValue=1000000001,
     sequenceName="transactionid_seq_gen",allocationSize=1)
     @GeneratedValue(generator="transactionid",strategy=GenerationType.SEQUENCE)
     private long transactionId;
     
     @Column(name="transactiondate",columnDefinition="date",nullable=false)
     private Date transactionDate;
     
     @Column(name="transactiontype",length=15,nullable=false)
     private String transactionType;
     
     @Column(name="debitedbalance",columnDefinition="numeric(5,2)",nullable=false)
     private double debitedBalance;
     
     @Column(name="availablebalance",columnDefinition="numeric(5,2)",nullable=false)
     private double availableBalance;
     
     @Column(name="redeempoints",length=10)
     private int redeemPoints;
     
     @ManyToOne
     @JoinColumn(name="card_number")
     private CreditCard cardNo;
     
     
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
	public CreditCard getCardNo() {
		return cardNo;
	}
	public void setCardNo(CreditCard cardNo) {
		this.cardNo = cardNo;
	}
	 
	  
}
