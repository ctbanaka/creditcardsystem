package com.cg.creditcardsystem.entities;

import javax.persistence.Column;
import javax.persistence.JoinColumn;

public class Address {
	@JoinColumn
	private UserRegistration userID;
	@Column(name="city",length=30)
    private String city;
	@Column(name="state",length=30)
    private String state;
	@Column(name="pincode",length=6, nullable=false)
    private int pincode;
	
	
	public UserRegistration getUserID() {
		return userID;
	}
	public void setUserID(UserRegistration userID) {
		this.userID = userID;
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
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
   
	
}
