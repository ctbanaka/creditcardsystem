package com.cg.creditcardsystem.dto;

import java.util.Date;

public class TransactionDateDto {
  private long cardNo;
  private Date startDate;
  private Date endDate;
public long getCardNo() {
	return cardNo;
}
public void setCardNo(long cardNo) {
	this.cardNo = cardNo;
}
public Date getStartDate() {
	return startDate;
}
public void setStartDate(Date startDate) {
	this.startDate = startDate;
}
public Date getEndDate() {
	return endDate;
}
public void setEndDate(Date endDate) {
	this.endDate = endDate;
}
@Override
public String toString() {
	return "TransactionDateDto [cardNo=" + cardNo + ", startDate=" + startDate + ", endDate=" + endDate + "]";
}
  
  
}
