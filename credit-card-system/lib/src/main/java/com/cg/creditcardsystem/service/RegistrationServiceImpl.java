package com.cg.creditcardsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.creditcardsystem.entities.Registration;
import com.cg.creditcardsystem.repository.RegistrationRepository;
@Service
public class RegistrationServiceImpl implements RegistrationService {
	@Autowired
	RegistrationRepository regrepo;

	@Override
	public void addUser(Registration reg) {
		Optional<Registration> register = regrepo.findById(reg.getUserId());
		regrepo.save(reg);
		}

	@Override
	public List<Registration> viewAllRegistration() {
		return regrepo.findAll();
	}

	@Override
	public void deleteRegistration(int userid) {
	   regrepo.deleteById(userid);
		
	}

	@Override
	public void updateRegistrattion(Registration reg) {
		regrepo.save(reg);
		
	}

	@Override
	public Optional<Registration> getRegById(int userid) {
		Optional<Registration> reg = regrepo.findById(userid);
		return reg;
	}

}
