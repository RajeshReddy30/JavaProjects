package com.xworkz.autospare.repository.seller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.autospare.entity.seller.SellerEntity;

@Repository
public class SellerRepositoryImplements implements SellerRepository {
	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean sellerSave(SellerEntity sellerentity) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(sellerentity);
		manager.getTransaction().commit();
		manager.close();
		return false;
	}
	@Override
	public SellerEntity getEmail(String email) {

		EntityManager manager = factory.createEntityManager();

		TypedQuery<SellerEntity> query = manager.createNamedQuery("findEmail", SellerEntity.class);
		query.setParameter("email", email);

		try {
			return query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}
	@Override
	public SellerEntity findByEmailAndPassword(String email, String password) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<SellerEntity> query = manager.createNamedQuery("authentication", SellerEntity.class);

		query.setParameter("email", email);
		query.setParameter("password", password);
		try {
			return query.getSingleResult();
		} catch (Exception e) {
			return null;
		}

	}

	@Override
	public boolean updateByEmail(SellerEntity entity) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.merge(entity);
		manager.getTransaction().commit();
		manager.close();
		
		return true;

	}

	@Override
	public boolean deleteByEmail(SellerEntity entity) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.merge(entity);
		manager.getTransaction().commit();
		manager.close();
		
		return true;
	}

	

}
