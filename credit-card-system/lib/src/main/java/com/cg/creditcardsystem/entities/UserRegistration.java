package com.cg.creditcardsystem.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="userregistration")
public class UserRegistration {
	@Id
	@SequenceGenerator(name="userid",initialValue=1000,
	sequenceName="userid_seq_gen",allocationSize=1)
	@GeneratedValue(generator="userid",strategy=GenerationType.SEQUENCE)
    private int userID;
	@Column(name="firstname", length=30, nullable=false)
    private String firstname;
	@Column(name="lastname", length=30)
    private String lastname;
	@Column(name="dob",columnDefinition = "date",nullable=false)
    private Date dateofbirth;
	@Column(name="phoneno",nullable=false, length=10)
    private long phoneno;
	@Column(name="email", length=30)
    private String email;
	@Column(name="password",length=12)
    private String password;
}
