package com.cg.creditcardsystem.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
 class AddressDaoTest {
    @Autowired
    AddressRepository adrsrepo;
    @Autowired
    RegistrationRepository regrepo;
    @Autowired
    AddressService adrservice = new AddressServiceImpl();
    
    @Test
    void testAddAddress() {
  	AddressDto adrsdto = new AddressDto();
  	adrsdto.setCity("Aurangabad");
  	adrsdto.setState("Maharashtra");
  	adrsdto.setPinCode(431002);
  	adrsdto.setUserId(1000);
  
  }
  
    
   @Test
    void testGetAllItemsNotNull() {
  	@SuppressWarnings("unused")
		List<Address> addrlist = adrsrepo.findAll();
    }
}
