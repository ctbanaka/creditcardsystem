package com.cg.creditcardsystem.dto;

import java.util.Date;

import javax.persistence.Column;

public class TransactionDto {
	private long transactionId;
    private Date transactionDate;
    private String transactionType;
    private double debitedBalance;
    private double availableBalance;
    private int redeemPoints;

}
