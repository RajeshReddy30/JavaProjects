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
    private String transactionDate;
    private String initiatedBy;
    private LocalDateTime transactionTimestamp;
}

