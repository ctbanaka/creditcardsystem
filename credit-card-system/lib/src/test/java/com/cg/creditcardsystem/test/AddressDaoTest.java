package com.cg.creditcardsystem.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

 import org.junit.jupiter.api.Test;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.boot.test.context.SpringBootTest;

 import com.cg.creditcardsystem.entities.Address;
 import com.cg.creditcardsystem.repository.AddressRepository;




@SpringBootTest
 class AddressDaoTest {
    @Autowired
    AddressRepository adrsrepo;
    
    @Test
      void testGetAddrById() {
    	Address addr = adrsrepo.getAddress(30);
    	System.out.println(addr.getAddressId());
    	assertEquals(30,addr.getAddressId());
    }
    
   @Test
    void testGetAllItemsNotNull() {
    	@SuppressWarnings("unused")
		List<Address> addrlist = adrsrepo.findAll();
    }
}
