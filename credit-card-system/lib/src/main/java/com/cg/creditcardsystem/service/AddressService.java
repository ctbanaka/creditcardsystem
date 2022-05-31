package com.cg.creditcardsystem.service;

import java.util.List;
import java.util.Optional;

import com.cg.creditcardsystem.dto.AddressDto;
import com.cg.creditcardsystem.entities.Address;

public interface AddressService {
	int addAddress(AddressDto addrdto);
	List<AddressDto> viewAllAddress();
	Address getAddress(int userId);
	void deleteAddressById(int addressId);
	void updateAddress(Address addr);
}
