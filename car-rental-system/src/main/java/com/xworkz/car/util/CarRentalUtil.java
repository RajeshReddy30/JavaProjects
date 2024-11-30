package com.xworkz.car.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CarRentalUtil {
	public EntityManager getManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.car");
		return factory.createEntityManager();
	}


}
