package com.xworkz.payment.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.payment.dto.PaymentSystemDto;
import com.xworkz.payment.entity.PaymentEntity;
import com.xworkz.payment.repo.PaymentRepo;

@Component
public class PaymentSystemServiceImpl implements PaymentSystemService {
	@Autowired
	private PaymentRepo repo;
	

	@Override
	public boolean onsave(PaymentSystemDto dto) {
		PaymentEntity entity=new PaymentEntity();
		if (dto != null) {
			if (dto.getAmount() > 1000 && dto.getRecieverPhoneNumber() == 10) {
				System.out.println("Saved");
				BeanUtils.copyProperties(dto, entity);
				repo.onSave(entity);
				return true;
			}
		}else {
			System.out.println("Not Saved");
		}
		return false;

	}
	
	

}
