package com.cg.creditcardsystem.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="register")
public class Registration {
	@Id
	@SequenceGenerator(name="userid_seq",initialValue=1000,
	sequenceName="userid_seq_gen",allocationSize=1)
	@GeneratedValue(generator="userid_seq",strategy=GenerationType.SEQUENCE)
	@Column(name="userid")
    private int userId;
	@Column(name="firstname", length=30, nullable=false)
    private String firstName;
	@Column(name="lastname", length=30)
    private String lastName;
	@Column(name="dob",columnDefinition = "date",nullable=false)
    private Date dateOfBirth;
	@Column(name="phoneno",nullable=false, length=10)
    private long phoneNo;
	@Column(name="email", length=30)
    private String email;
	//@Transient
	@Column(name="password",length=12)
    private String password;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
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
	 
