package com.xworkz.autospare.repo.user;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.xworkz.autospare.entity.user.SignInEntity;
import com.xworkz.autospare.entity.user.SignUpEntity;


@Component
@Repository
public class ProjectRepositoryImp implements ProjectRepository {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean signUpSave(SignUpEntity signUpEntity) {
		System.out.println(signUpEntity);
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(signUpEntity);
		manager.getTransaction().commit();
		manager.close();
		return false;
	}

	@Override
	public boolean signInSave(SignInEntity signInEntity) {
		System.out.println(signInEntity);
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(signInEntity);
		manager.getTransaction().commit();
		manager.close();
		return false;
	}

	@Override
	public SignUpEntity findByEmailAndPassword(String email, String password) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<SignUpEntity> query = manager.createNamedQuery("authentication", SignUpEntity.class);

		query.setParameter("email", email);
		query.setParameter("password", password);
		try {
			return query.getSingleResult();
		} catch (Exception e) {
			return null;
		}

	}
	@Override
	public SignUpEntity getEmail(String email) {

		EntityManager manager = factory.createEntityManager();

		TypedQuery<SignUpEntity> query = manager.createNamedQuery("findByEmail", SignUpEntity.class);
		System.out.println("findby email"+query);
		query.setParameter("email", email);

		try {
			return query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public boolean getAadharNumber(long aadharNumber) {

		EntityManager manager = factory.createEntityManager();
		
		TypedQuery<SignUpEntity> query = manager.createNamedQuery("findByAadhar", SignUpEntity.class);
		query.setParameter("aadharNumber", aadharNumber);
          

		try {
			if(query.getSingleResult()!=null) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;}

	@Override
	public boolean getContactNumber(long contactNumber) {
EntityManager manager = factory.createEntityManager();
		
		TypedQuery<SignUpEntity> query = manager.createNamedQuery("findByContact", SignUpEntity.class);
		query.setParameter("contactNumber", contactNumber);
          

		try {
			if(query.getSingleResult()!=null) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean updateByEmail(SignUpEntity entity) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.merge(entity);
		manager.getTransaction().commit();
		manager.close();
		
		return true;

	}

	@Override
	public boolean deleteByEmail(SignUpEntity entity) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.merge(entity);
		manager.getTransaction().commit();
		manager.close();
		
		return true;
	}

	@Override
	public SignUpEntity getInActiveEmail(String email) {
		
		EntityManager manager = factory.createEntityManager();
		TypedQuery<SignUpEntity> query = manager.createNamedQuery("checkInActiveEmail", SignUpEntity.class);
		query.setParameter("email", email);
			
		try {
			if (query.getSingleResult() != null) {
				return query.getSingleResult();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public SignUpEntity findById(int id) {
		EntityManager manager = factory.createEntityManager();
		SignUpEntity entity = manager.find(SignUpEntity.class, id);
		return entity;
	}

}


