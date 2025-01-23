package com.xworkz.bank.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class BankEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	 private String accountHolderName;
	    private long accountNumber;
	    private double transactionAmount;
	    private String transactionId;
	    private String paymentMethod;
	    private String transactionDate;
	    private String initiatedBy;
	    private LocalDateTime transactionTimestamp;

}
