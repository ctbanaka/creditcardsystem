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
     private long transactionid;
     @Column(name="transactiondate",columnDefinition="date",nullable=false)
     private Date transactiondate;
     @Column(name="transactiontype",length=15,nullable=false)
     private String transactiontype;
     @Column(name="debitedbalance",columnDefinition="numeric(5,2)",nullable=false)
     private double debitedbalance;
     @Column(name="availablebalance",columnDefinition="numeric(5,2)",nullable=false)
     private double availablebalance;
     @Column(name="redeempoints",length=10)
     private int redeempoints;
     @ManyToOne
     @JoinColumn(name="creditcardno")
     private CreditCard creditcardno;
	public long getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(long transactionid) {
		this.transactionid = transactionid;
	}
	public Date getTransactiondate() {
		return transactiondate;
	}
	public void setTransactiondate(Date transactiondate) {
		this.transactiondate = transactiondate;
	}
	public String getTransactiontype() {
		return transactiontype;
	}
	public void setTransactiontype(String transactiontype) {
		this.transactiontype = transactiontype;
	}
	public double getDebitedbalance() {
		return debitedbalance;
	}
	public void setDebitedbalance(double debitedbalance) {
		this.debitedbalance = debitedbalance;
	}
	public double getAvailablebalance() {
		return availablebalance;
	}
	public void setAvailablebalance(double availablebalance) {
		this.availablebalance = availablebalance;
	}
	public int getRedeempoints() {
		return redeempoints;
	}
	public void setRedeempoints(int redeempoints) {
		this.redeempoints = redeempoints;
	}
	public CreditCard getCreditcardno() {
		return creditcardno;
	}
	public void setCreditcardno(CreditCard creditcardno) {
		this.creditcardno = creditcardno;
	}
     
}
