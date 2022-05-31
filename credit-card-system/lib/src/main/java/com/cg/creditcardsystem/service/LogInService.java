package com.cg.creditcardsystem.service;

import com.cg.creditcardsystem.dto.LogInDto;
import com.cg.creditcardsystem.entities.Registration;

public interface LogInService {
  int addUserLogin(LogInDto logindto);
}
