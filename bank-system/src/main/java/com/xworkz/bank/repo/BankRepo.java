package com.xworkz.bank.repo;

import com.xworkz.bank.entity.BankEntity;

public interface BankRepo {
	boolean onSave(BankEntity entity);

}
