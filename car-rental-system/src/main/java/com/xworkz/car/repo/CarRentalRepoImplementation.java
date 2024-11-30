package com.xworkz.car.repo;

import javax.persistence.EntityManager;

import com.xworkz.car.entity.CarRentalEntity;
import com.xworkz.car.util.CarRentalUtil;

public class CarRentalRepoImplementation implements CarRentalRepo{
	@Override
	public void save(CarRentalEntity entity) {
		System.out.println("repo save method");
		// TODO Auto-generated method stub
		CarRentalUtil util=new CarRentalUtil();
		EntityManager manager=util.getManager();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
		
	}

}
