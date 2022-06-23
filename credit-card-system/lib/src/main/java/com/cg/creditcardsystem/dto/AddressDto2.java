package com.cg.creditcardsystem.dto;

public class AddressDto2 {
	
	private int addressId;
	private String city;
	   private String state;
	   private int pinCode;
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
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
		return "AddressDto2 [addressId=" + addressId + ", city=" + city + ", state=" + state + ", pinCode=" + pinCode
				+ "]";
	}
	   
	   

}
