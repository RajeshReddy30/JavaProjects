package com.xworkz.bank.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.bank.entity.BankEntity;

@Component
public class BankRepoImp implements BankRepo{
	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean onSave(BankEntity entity) {
		System.out.println(entity);
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
		return false;
	}

}
