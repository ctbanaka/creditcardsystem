package com.cg.creditcardsystem.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="credit_card")
public class CreditCard {
	@Id
	@SequenceGenerator(name="cardno",initialValue=  (int) 100000000000001L,
	sequenceName="cardno_seq_gen",allocationSize=1)
	@GeneratedValue(generator="cardno",strategy=GenerationType.SEQUENCE)
	@Column(name="card_number")
	private long cardNo;
	@Column(name="cardtype",length=20,nullable=false)
	private String cardType;
	@Column(name="expirydate",columnDefinition="date",nullable=false)
	private Date expiryDate;
	@Column(name="cvv",length=3,nullable=false)
	private int cvv;
	private double creditLimit;
	@OneToOne
	@JoinColumn(name="userid")
	private Registration userid;
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
	public Registration getUserid() {
		return userid;
	}
	public void setUserid(Registration userid) {
		this.userid = userid;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	 
	 
	 
	
}
