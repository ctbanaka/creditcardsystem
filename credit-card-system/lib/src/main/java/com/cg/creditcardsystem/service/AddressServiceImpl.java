package com.cg.creditcardsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.creditcardsystem.entities.Address;
import com.cg.creditcardsystem.repository.AddressRepository;
@Service
public class AddressServiceImpl implements AddressService {
  @Autowired
  AddressRepository  adrsrepo;
	@Override
	public void addAddress(Address adrs) {
		adrsrepo.save(adrs);
		
	}

}
