package com.cg.creditcardsystem.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.creditcardsystem.dto.AddressDto;
import com.cg.creditcardsystem.dto.RegistrationDto;
import com.cg.creditcardsystem.entities.Registration;
import com.cg.creditcardsystem.repository.RegistrationRepository;
@Service
public class RegistrationServiceImpl implements RegistrationService {
	@Autowired
	RegistrationRepository regrepo;

	@Override
	public void addUser(Registration reg) {
		@SuppressWarnings("unused")
		Optional<Registration> register = regrepo.findById(reg.getUserId());
		regrepo.save(reg);
		}

	@Override
	public List<RegistrationDto> viewAllUserDetails() {
		List<Registration> reglist = regrepo.findAll();
		ArrayList<RegistrationDto> registerList =new ArrayList<RegistrationDto>();
		RegistrationDto regdto= new RegistrationDto();
		 for(Registration reg: reglist) {
			 regdto.setUserId(reg.getUserId());
			 regdto.setFirstName(reg.getFirstName());
			 regdto.setLastName(reg.getLastName());
			 regdto.setEmail(reg.getEmail());
			 regdto.setPhoneNo(reg.getPhoneNo());
			 regdto.setDateOfBirth(reg.getDateOfBirth());
			 registerList.add(regdto);
		 }
		 return registerList;
	}

	@Override
	public void deleteUser(int userid) {
	   regrepo.deleteById(userid);
		
	}

	@Override
	public void updateUserDetails(Registration reg) {
		regrepo.save(reg);
		
	}

	@Override
	public Optional<Registration> getRegById(int userid) {
		Optional<Registration> reg = regrepo.findById(userid);
		return reg;
	}

}
