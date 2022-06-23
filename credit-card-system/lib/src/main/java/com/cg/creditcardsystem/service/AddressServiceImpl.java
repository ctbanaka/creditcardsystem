package com.cg.creditcardsystem.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.creditcardsystem.dto.AddressDto;
import com.cg.creditcardsystem.entities.Address;
import com.cg.creditcardsystem.entities.Registration;
import com.cg.creditcardsystem.exceptions.AddressNotFoundExcetpion;
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
      adrsrepo.save(addr);
      return addr.getAddressId();
		
	}

	@Override
	public List<AddressDto> viewAllAddress() {
		
		List<Address> address =adrsrepo.findAll();
		System.out.println(address);
		ArrayList<AddressDto>addresslist=new ArrayList<AddressDto>();
	
		 for(Address addr:address) {
		    AddressDto addressdto=new AddressDto();
			addressdto.setAddressId(addr.getAddressId());
			addressdto.setCity(addr.getCity());
			addressdto.setState(addr.getState());
			addressdto.setPinCode(addr.getPinCode());
			addressdto.setUserId(addr.getUserId().getUserId());

			addresslist.add(addressdto);
			
			}
		return addresslist;
	}



	@Override
	public AddressDto getAddress(int userId) {
	 Address addrs=adrsrepo.getAddress(userId);
	  if(addrs==null) {
		  throw new AddressNotFoundExcetpion();	  
	  }
	  AddressDto addrDto= new AddressDto();
	  
	  addrDto.setAddressId(addrs.getUserId().getUserId());
	  addrDto.setAddressId(addrs.getAddressId());
	  addrDto.setCity(addrs.getCity());
	  addrDto.setPinCode(addrs.getPinCode());
	  addrDto.setState(addrs.getState());
	  return addrDto;
	}

	@Override
	public void deleteAddressById(int addressId) {
	  adrsrepo.deleteById(addressId);
		
	}


	@Override
	public void updateAddress(AddressDto addrdto) {
		Address addr=adrsrepo.getById(addrdto.getAddressId());
		  
		   Registration reg= regrepo.getById(addrdto.getUserId());
		      addr.setCity(addrdto.getCity());
		      addr.setState(addrdto.getState());
		      addr.setPinCode(addrdto.getPinCode());
		      addr.setUserId(reg); 
		adrsrepo.save(addr);
	}
   
}
