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
	@SequenceGenerator(name="cardno",initialValue=(int) 100000000000001L,
	sequenceName="cardno_seq_gen",allocationSize=1)
	@GeneratedValue(generator="cardno",strategy=GenerationType.SEQUENCE)
	private long cardno;
	@Column(name="cardtype",length=20,nullable=false)
	private String cardtype;
	@Column(name="expirydate",columnDefinition="date",nullable=false)
	private Date expirydate;
	@Column(name="cvv",length=3,nullable=false)
	private int cvv;
	@OneToOne
	@JoinColumn(name="userid")
	private UserRegistration userid;
	public long getCardno() {
		return cardno;
	}
	public void setCardno(long cardno) {
		this.cardno = cardno;
	}
	public String getCardtype() {
		return cardtype;
	}
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	public Date getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(Date expirydate) {
		this.expirydate = expirydate;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public UserRegistration getUserid() {
		return userid;
	}
	public void setUserid(UserRegistration userid) {
		this.userid = userid;
	}
	
}
