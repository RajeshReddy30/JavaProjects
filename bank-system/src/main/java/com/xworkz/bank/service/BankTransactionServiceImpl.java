package com.xworkz.bank.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.xworkz.bank.dto.BankTransactionDto;
import com.xworkz.bank.entity.BankEntity;
import com.xworkz.bank.repo.BankRepo;

@Component
public class BankTransactionServiceImpl implements BankTransactionService {
	private BankRepo repo;

    @Override
    public boolean saveTransaction(BankTransactionDto dto) {
    	BankEntity entity=new BankEntity();
        if (dto != null) {
            if (dto.getTransactionAmount() > 1000 && String.valueOf(dto.getAccountNumber()).length() == 10) {
                System.out.println("Transaction saved successfully");
                BeanUtils.copyProperties(dto, entity);
                repo.onSave(entity);
                return true;
            }
        } else {
            System.out.println("Transaction failed");
        }
        return false;
    }

	
}
