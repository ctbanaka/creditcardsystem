package com.cg.creditcardsystem.service;


import java.util.List;
import java.util.Optional;

import com.cg.creditcardsystem.entities.Registration;

public interface RegistrationService {
     void addUser(Registration reg);
     List<Registration> viewAllUserDetails();
     void deleteUser(int userid);
     void updateUserDetails(Registration reg);
     Optional<Registration> getUserById(int userid);
}

