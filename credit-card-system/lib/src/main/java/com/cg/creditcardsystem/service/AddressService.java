package com.cg.creditcardsystem.service;

import java.util.List;
import com.cg.creditcardsystem.dto.AddressDto;
import com.cg.creditcardsystem.dto.AddressDto2;
import com.cg.creditcardsystem.entities.Address;

public interface AddressService {
	int addAddress(AddressDto addrdto);
	List<AddressDto> viewAllAddress();
	AddressDto getAddress(int userId);
	void deleteAddressById(int addressId);
	void updateAddress(AddressDto2 addrdto);
}
