package com.xworkz.payment.repo;

import org.springframework.stereotype.Component;

import com.xworkz.payment.entity.PaymentEntity;
@Component
public class paymentRepoImp implements PaymentRepo {

	@Override
	public boolean onSave(PaymentEntity entity) {
		System.out.println("entity is:"+entity);
		return false;
	}

}
