package com.xworkz.bank.service;

import org.springframework.stereotype.Component;

import com.xworkz.bank.dto.BankTransactionDto;

@Component
public class BankTransactionServiceImpl implements BankTransactionService {

    @Override
    public boolean saveTransaction(BankTransactionDto dto) {
        if (dto != null) {
            if (dto.getTransactionAmount() > 1000 && String.valueOf(dto.getAccountNumber()).length() == 10) {
                System.out.println("Transaction saved successfully");
                return true;
            }
        } else {
            System.out.println("Transaction failed");
        }
        return false;
    }

	
}
