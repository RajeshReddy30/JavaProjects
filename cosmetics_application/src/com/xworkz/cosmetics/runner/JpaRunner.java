package com.xworkz.cosmetics.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.cosmetics.entity.CosmeticEntity;

public class JpaRunner {
	public static void main(String[] args) {
	EntityManagerFactory factory=	Persistence.createEntityManagerFactory("com.xworkz");
	System.out.println("factory is:"+factory);
	EntityManager manager= factory.createEntityManager();
	CosmeticEntity entity=new CosmeticEntity();
	entity.setName("facial");
	entity.setType("face");
	entity.setPrice(876);
	manager.getTransaction().begin();
manager.persist(entity);
	manager.getTransaction().commit();
	manager.close();
	}

}
