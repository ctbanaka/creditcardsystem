package com.cg.creditcardsystem.dto;

public class AddressDto {
   private int userId;
   private String city;
   private String state;
   private int pinCode;
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
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
@Override
public String toString() {
	return "AddressDto [userId=" + userId + ", city=" + city + ", state=" + state + ", pinCode=" + pinCode + "]";
}
   
   
}
