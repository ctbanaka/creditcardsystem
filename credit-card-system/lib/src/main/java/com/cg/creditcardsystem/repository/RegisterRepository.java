package com.cg.creditcardsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.creditcardsystem.entities.Registration;

public interface RegisterRepository extends JpaRepository<Registration, Integer> {

}
