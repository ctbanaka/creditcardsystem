package com.cg.creditcardsystem.service;


import java.util.List;
import java.util.Optional;

import com.cg.creditcardsystem.entities.Registration;
import com.cg.creditcardsystem.exceptions.UserAlreadyExistException;
import com.cg.creditcardsystem.exceptions.UserNotFoundException;

public interface RegistrationService {
     void addUser(Registration reg) throws UserAlreadyExistException;
     List<Registration> viewAllUserDetails();
     void deleteUser(int userid);
     void updateUserDetails(Registration reg);
     Optional<Registration> getRegById(int userid) throws UserNotFoundException;
}

