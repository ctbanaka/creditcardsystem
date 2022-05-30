package com.cg.creditcardsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.creditcardsystem.entities.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Integer> {
<<<<<<< HEAD
   @Query(value="select reg from registration reg where reg.userid=?1")
  public void getRegById();
=======
   @Query(value="select reg from Registration reg where reg.userId=?1")
   Registration getRegById(int userid);
>>>>>>> 2cd43a77538262f9ad0937f79719ce51477003ef

}
