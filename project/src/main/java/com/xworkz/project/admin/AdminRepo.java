package com.xworkz.project.admin;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class AdminRepo {
	@Autowired
	private EntityManagerFactory factory;

	public AdminEntity findByEmailAndPassword(String email, String password) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<AdminEntity> query = manager.createNamedQuery("authenticate", AdminEntity.class);

		query.setParameter("email", email);
		query.setParameter("password", password);
		try {
			return query.getSingleResult();
		} catch (Exception e) {
			return null;
		}

	}

}
