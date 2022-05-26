package com.cg.creditcardsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.creditcardsystem.entities.Register;

public interface RegisterRepository extends JpaRepository<Register, Integer> {

}
