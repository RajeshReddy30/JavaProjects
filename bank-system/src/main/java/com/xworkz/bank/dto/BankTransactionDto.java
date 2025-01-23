package com.xworkz.bank.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class BankTransactionDto {

    private String accountHolderName;
    private long accountNumber;
    private double transactionAmount;
    private String transactionId;
    private String paymentMethod;
    private LocalDateTime transactionDate;
    private String initiatedBy;
  
}

