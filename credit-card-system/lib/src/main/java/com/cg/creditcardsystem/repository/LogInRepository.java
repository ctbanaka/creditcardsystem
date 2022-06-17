package com.cg.creditcardsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.creditcardsystem.entities.LogIn;
@Repository
public interface LogInRepository extends JpaRepository<LogIn, Integer>{

}
