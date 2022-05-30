package com.cg.creditcardsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.creditcardsystem.entities.CreditCard;
import com.cg.creditcardsystem.entities.Registration;
import com.google.common.base.Optional;

import antlr.collections.List;

public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {


		
}
