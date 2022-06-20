package com.cg.creditcardsystem.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="creditcard")
public class CreditCard {
	
	@Id
	@Column(name="cardnumber",length=16, unique=true)
	private long cardNo;
	@Column(name="cardtype",length=20,nullable=false)
	private String cardType;
	@Column(name="expirydate",columnDefinition="date",nullable=false)
	private Date expiryDate;
	@Column(name="cvv",length=3,nullable=false)
	private int cvv;
	@OneToOne
	@JoinColumn(name="userid")
	private Registration userId;
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
	public void setCvv(int cvv) {	}
	public Registration getUserId() {
		return userId;
	}
	public void setUserId(Registration userId) {
		this.userId = userId;
	}
	
}
