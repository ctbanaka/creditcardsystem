package com.cg.creditcardsystem.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userregistration")
public class UserRegistration {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int userID;
    private String firstname;
    private String lastname;
    private Date dateofbirth;
    private long phoneno;
    private String email;
    private String password;
}
