package com.cg.creditcardsystem.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.creditcardsystem.entities.Address;
import com.cg.creditcardsystem.repository.AddressRepository;

public class AddressServiceImpl implements AddressService {
  @Autowired
  AddressRepository  adrsrepo;
	@Override
	public void addAddress(Address adrs) {
		
	}

}
