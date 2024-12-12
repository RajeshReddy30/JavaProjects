package com.xworkz.bank.service;

import com.xworkz.bank.dto.BankTransactionDto;

public interface BankTransactionService {

    boolean saveTransaction(BankTransactionDto dto);
}
