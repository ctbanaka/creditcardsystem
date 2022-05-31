package com.cg.creditcardsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.creditcardsystem.dto.LogInDto;
import com.cg.creditcardsystem.entities.LogIn;
import com.cg.creditcardsystem.entities.Registration;
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
		
		Registration reg= regrepo.getById(logindto.getLogIn());
		LogIn login=new LogIn();
		login.setLoginId(logindto.getLogIn());
		login.setPassword(logindto.getPassword());
		login.setRole("user");
		loginrepo.save(login);
		return login.getSlno();
	}

}
