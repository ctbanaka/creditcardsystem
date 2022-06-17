package com.cg.creditcardsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.creditcardsystem.entities.Address;
@Repository
public interface AddressRepository extends JpaRepository <Address,Integer>{
	
 @Query(value="select addr from Address addr where addr.userId=?1")
 Address getAddress(int UserId);
}
