package com.cg.creditcardsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.creditcardsystem.entities.Registration;
@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Integer> {

  @Query(value="select reg.userId,reg.password from Registration reg where reg.userId=?1")
  Registration getUserbyId(int userId);
}
