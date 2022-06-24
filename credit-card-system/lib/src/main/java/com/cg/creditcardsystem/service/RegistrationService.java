package com.cg.creditcardsystem.service;


import java.util.List;
import java.util.Optional;

import com.cg.creditcardsystem.dto.RegistrationDto;
import com.cg.creditcardsystem.entities.Registration;
import com.cg.creditcardsystem.exceptions.UserAlreadyExistException;
import com.cg.creditcardsystem.exceptions.UserNotFoundException;

public interface RegistrationService {
     int addUser(Registration reg) throws UserAlreadyExistException;
     List<RegistrationDto> viewAllUserDetails();
     void deleteUser(int userid);
     void updateUserDetails(Registration reg);
     Registration getUserById(int userid) throws UserNotFoundException;
}

