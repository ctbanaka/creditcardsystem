package com.cg.creditcardsystem.service;


import java.util.List;

import com.cg.creditcardsystem.entities.Registration;

public interface RegistrationService {
     void addUser(Registration reg);
     List<Registration> viewAllRegistration();
     void deleteRegistration(int userid);
     void updateRegistrattion(Registration reg);
}

