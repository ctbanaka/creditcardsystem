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
     @SequenceGenerator(name="transactionid",initialValue=1001,
     sequenceName="transactionid_seq_gen",allocationSize=1)
     @GeneratedValue(generator="transactionid",strategy=GenerationType.SEQUENCE)
     private int transactionId;
     
     @Column(name="transactiondate",columnDefinition="date",nullable=false)
     private Date transactionDate;
     
     @Column(name="description",length=15,nullable=false)
     private String description;
     
     @Column(name="debitedbalance",columnDefinition="numeric(6,2)",nullable=false)
     private double debitedBalance;
     
     @Column(name="redeempoints",length=10)
     private double redeemPoints;
     
     @ManyToOne
     @JoinColumn(name="card_number")
     private CreditCard card;

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getDebitedBalance() {
		return debitedBalance;
	}

	public void setDebitedBalance(double debitedBalance) {
		this.debitedBalance = debitedBalance;
	}

	 
	 

	public double getRedeemPoints() {
		return redeemPoints;
	}

	public void setRedeemPoints(double redeemPoints) {
		this.redeemPoints = redeemPoints;
	}

	public CreditCard getCard() {
		return card;
	}

	public void setCard(CreditCard card) {
		this.card = card;
	}

	 

	 

	 
     
	
	 
	  
}
