package com.cg.creditcardsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.creditcardsystem.entities.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Integer> {
   @Query(value="select reg from registration reg where reg.userid=?1")
   Registration getRegById(int userid);

}
