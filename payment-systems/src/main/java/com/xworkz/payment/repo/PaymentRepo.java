package com.xworkz.payment.repo;

import com.xworkz.payment.entity.PaymentEntity;

public interface PaymentRepo {
	boolean onSave(PaymentEntity entity);

}
