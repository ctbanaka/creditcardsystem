package com.cg.creditcardsystem.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

 import org.junit.jupiter.api.Test;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.boot.test.context.SpringBootTest;

import com.cg.creditcardsystem.dto.AddressDto;
import com.cg.creditcardsystem.entities.Address;
 import com.cg.creditcardsystem.repository.AddressRepository;
import com.cg.creditcardsystem.repository.RegistrationRepository;
import com.cg.creditcardsystem.service.AddressService;
import com.cg.creditcardsystem.service.AddressServiceImpl;




@SpringBootTest
public class AddressDaoTest {
    @Autowired
    AddressRepository adrsrepo;
   @Autowired
   RegistrationRepository regrepo;
   @Autowired
   AddressService adrservice = new AddressServiceImpl();
    
  @Test
  void testAddAddress() {
	  AddressDto adrsdto = new AddressDto();
	  adrsdto.setCity("Aurangabd");
      adrsdto.setState("Maharashtra");
      adrsdto.setPinCode(431002);
      adrsdto.setUserId(1000);
      
       int addressid = AddressService.addAddress(adrsdto);
      Address adrs =adrsrepo.getById(addressid);
      assertEquals(addressid, adrs.getAddressId());
  }
}
