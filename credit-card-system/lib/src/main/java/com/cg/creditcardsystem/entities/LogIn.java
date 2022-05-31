package com.cg.creditcardsystem.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class LogIn {
	
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int slno;
   @Column(name="loginid")
   private int loginId;
   @Column(name="password")
   private String password;
  
public int getSlno() {
	return slno;
}
public void setSlno(int slno) {
	this.slno = slno;
}
public int getLoginId() {
	return loginId;
}
public void setLoginId(int loginId) {
	this.loginId = loginId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

   
   
}
