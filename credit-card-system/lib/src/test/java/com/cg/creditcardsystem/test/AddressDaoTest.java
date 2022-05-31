package com.cg.creditcardsystem.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

 import org.junit.jupiter.api.Test;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.boot.test.context.SpringBootTest;

 import com.cg.creditcardsystem.entities.Address;
 import com.cg.creditcardsystem.repository.AddressRepository;




@SpringBootTest
public class AddressDaoTest {
    @Autowired
    AddressRepository adrsrepo;
    
    @Test
    public void testGetAddrById() {
    	Address addr = adrsrepo.getAddress(30);
    	System.out.println(addr.getAddressId());
    	assertEquals(addr.getAddressId(),30);
    }
    
   @Test
    void testGetAllItemsNotNull() {
    	List<Address> addrlist = adrsrepo.findAll();
    }
}
