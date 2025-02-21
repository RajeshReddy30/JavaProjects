package com.xworkz.autospare.repository.seller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import com.xworkz.autospare.entity.seller.SparePartEntity;

public class SparePartRepositoryImplements implements SparePartRepository{
	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean sparePartSave(SparePartEntity sparePartentity) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(sparePartentity);
		manager.getTransaction().commit();
		manager.close();
		return false;
	}

}
