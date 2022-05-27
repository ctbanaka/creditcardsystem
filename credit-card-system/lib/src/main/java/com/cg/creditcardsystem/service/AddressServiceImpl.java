package com.cg.creditcardsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.creditcardsystem.dto.AddressDto;
import com.cg.creditcardsystem.entities.Address;
import com.cg.creditcardsystem.entities.Registration;
import com.cg.creditcardsystem.repository.AddressRepository;
import com.cg.creditcardsystem.repository.RegistrationRepository;
@Service
public class AddressServiceImpl implements AddressService {
  @Autowired
  AddressRepository  adrsrepo;
  @Autowired
  RegistrationRepository regrepo;
  
	@Override
	public int addAddress(AddressDto addrdto) {
	   Registration reg= regrepo.getById(addrdto.getUserId());
      Address addr= new Address();
      addr.setUserId(reg);
      addr.setCity(addrdto.getCity());
      addr.setState(addrdto.getState());
      addr.setPinCode(addrdto.getPinCode());
      System.out.println(addrdto);
      return addr.getAddressId();
		
	}

}
