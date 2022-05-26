package com.cg.creditcardsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.creditcardsystem.entities.Address;

public interface AddressRepository extends JpaRepository <Address,Integer>{
	

}
