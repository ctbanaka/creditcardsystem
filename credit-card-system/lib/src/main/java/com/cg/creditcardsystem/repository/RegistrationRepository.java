package com.cg.creditcardsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.creditcardsystem.entities.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Integer> {

	Registration getUserById(int userId);

}
