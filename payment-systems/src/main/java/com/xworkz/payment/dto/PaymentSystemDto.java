package com.xworkz.payment.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class PaymentSystemDto {
	private int id;

	private String recieverName;
	
	private long recieverPhoneNumber;

	private int amount;

	private String transactionId;

	private String paymentMethod;

	private String transactionDate;

	private String createdBy;

	private LocalDateTime createdOn;

}