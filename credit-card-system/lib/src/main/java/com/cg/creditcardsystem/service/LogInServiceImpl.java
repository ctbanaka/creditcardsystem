package com.cg.creditcardsystem.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.creditcardsystem.entities.LogIn;
import com.cg.creditcardsystem.entities.Registration;
import com.cg.creditcardsystem.repository.LogInRepository;

public class LogInServiceImpl implements LogInService {
	@Autowired
	LogInRepository loginrepo;

	@Override
	public int addUserLogin(Registration reg) {
		LogIn login=new LogIn();
		login.setLoginId(reg.getUserId());
		login.setPassword(reg.getPassword());
		login.setRole("user");
		loginrepo.save(login);
		return login.getSlno();
	}

}
