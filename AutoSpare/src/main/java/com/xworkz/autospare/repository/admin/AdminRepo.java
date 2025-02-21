package com.xworkz.autospare.repository.admin;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.xworkz.autospare.entity.admin.AdminEntity;
import com.xworkz.autospare.entity.user.SignUpEntity;

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
	
	public List<SignUpEntity> findactive() {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		TypedQuery<SignUpEntity> query = manager.createNamedQuery("findActive", SignUpEntity.class);
		return query.getResultList();
		
	}

	
	public List<SignUpEntity> findInactive() {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		TypedQuery<SignUpEntity> query = manager.createNamedQuery("findInActive", SignUpEntity.class);
		return query.getResultList();
	}

}
