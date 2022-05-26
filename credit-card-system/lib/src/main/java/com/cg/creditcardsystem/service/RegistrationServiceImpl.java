package com.cg.creditcardsystem.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.creditcardsystem.entities.Registration;
import com.cg.creditcardsystem.repository.RegistrationRepository;

public class RegistrationServiceImpl implements RegistrationService {
	@Autowired
	RegistrationRepository resrepo;

	@Override
	public void addRegistration(Registration res) {
		resrepo.save(res);
		
	}

}
