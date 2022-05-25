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
	@SequenceGenerator(name="userid_seq",initialValue=1000,
	sequenceName="userid_seq_gen",allocationSize=1)
	@GeneratedValue(generator="userid_seq",strategy=GenerationType.SEQUENCE)
	@Column(name="userid")
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
	
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
