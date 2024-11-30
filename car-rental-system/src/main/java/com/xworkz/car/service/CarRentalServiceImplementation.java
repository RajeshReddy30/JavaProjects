package com.xworkz.car.service;

import com.xworkz.car.dto.CarRentalDto;
import com.xworkz.car.entity.CarRentalEntity;
import com.xworkz.car.repo.CarRentalRepo;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class CarRentalServiceImplementation implements CarRentalService {
	private CarRentalRepo repo;

	@Override
	public String save(CarRentalDto dto) {
		System.out.println("service save method");
		CarRentalEntity entity=new CarRentalEntity();
		if(dto!=null) {
			entity.setCustomerName(dto.getCustomerName());
			entity.setCustomerEmail(dto.getCustomerEmail());
			entity.setCarModel(dto.getCarModel());
			entity.setCarLicensePlate(dto.getCarLicensePlate());
			entity.setRentalCost(dto.getRentalCost());
			entity.setRentalStartDate(dto.getRentalStartDate());
			entity.setRentalEndDate(dto.getRentalEndDate());
		
		repo.save(entity);
		return "saved successfully";
		}
		return "not saved";
	}

}
