package com.cg.creditcardsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.creditcardsystem.dto.LogInDto;
import com.cg.creditcardsystem.entities.LogIn;
import com.cg.creditcardsystem.entities.Registration;
import com.cg.creditcardsystem.exceptions.InValidCredentialsException;
import com.cg.creditcardsystem.repository.LogInRepository;
import com.cg.creditcardsystem.repository.RegistrationRepository;
 @Service
public class LogInServiceImpl implements LogInService {
	@Autowired
	LogInRepository loginrepo;
	@Autowired
    RegistrationRepository regrepo;
	@Override
	public int addUserLogin(LogInDto logindto) {
		Registration reg= regrepo.getById(logindto.getLogInId());
		
		if((reg.getUserId()!=logindto.getLogInId()))
			throw new InValidCredentialsException();
		
		LogIn login=new LogIn();
		
		login.setLoginId(logindto.getLogInId());
		login.setPassword(logindto.getPassword());
		loginrepo.save(login);
		return login.getSlno();
	}

}
