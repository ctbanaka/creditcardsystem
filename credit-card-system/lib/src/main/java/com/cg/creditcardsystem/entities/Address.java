package com.cg.creditcardsystem.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	@OneToOne
	@JoinColumn(name="userid")
	private Registration userId;
	@Column(name="city",length=30)
    private String city;
	@Column(name="state",length=30)
    private String state;
	@Column(name="pincode",length=6, nullable=false)
    private int pinCode;
	public Registration getUserId() {
		return userId;
	}
	public void setUserId(Registration userId) {
		this.userId = userId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	
	 
	 
	
}
