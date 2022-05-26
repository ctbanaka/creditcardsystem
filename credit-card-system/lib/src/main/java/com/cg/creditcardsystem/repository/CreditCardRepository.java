package com.cg.creditcardsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.creditcardsystem.entities.CreditCard;
import com.cg.creditcardsystem.entities.Registration;

public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {

}
