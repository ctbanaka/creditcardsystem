package com.cg.creditcardsystem.service;

import java.util.List;

import com.cg.creditcardsystem.dto.AddressDto;
import com.cg.creditcardsystem.entities.Address;

public interface AddressService {
	int addAddress(AddressDto addrdto);
	List<Address> viewAllAddress();
	void deleteAddress(int addressId);
	void updateAddress(Address adrs);
	
}
