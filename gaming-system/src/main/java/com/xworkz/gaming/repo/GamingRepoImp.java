package com.xworkz.gaming.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.gaming.entity.GamingEntity;

@Component
public class GamingRepoImp implements GamingRepo {
	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean onSave(GamingEntity entity) {
		System.out.println(entity);
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
		return false;
	}

	@Override
	public List<GamingEntity> findAll() {
		EntityManager manager= factory.createEntityManager();
		TypedQuery<GamingEntity>query=manager.createNamedQuery("findall",GamingEntity.class);
		
		return query.getResultList();
	}
	@Override
	public GamingEntity findById(int id) {
		 EntityManager manager = factory.createEntityManager();
	        TypedQuery<GamingEntity> query = manager.createNamedQuery("findById", GamingEntity.class);
	        query.setParameter("id", id);
	        return query.getSingleResult();
	}

	@Override
	public boolean deleteById(int id) {
		  EntityManager manager = factory.createEntityManager();
	        manager.getTransaction().begin();
	        manager.createNamedQuery("deleteById")
	                .setParameter("id", id)
	                .executeUpdate();
	        manager.getTransaction().commit();
	        manager.close();
	        return true;
	}

	@Override
	public boolean updateById(int id, GamingEntity entity) {
		EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();
        int result = manager.createNamedQuery("updateById")
                .setParameter("id",id)
                .setParameter("playerName", entity.getPlayerName())
                .setParameter("playerScore", entity.playerScore)
                .setParameter("playerLevel", entity.playerLevel)
                .setParameter("actionType", entity.getActionType())
                .setParameter("actionTime", entity.actionTime)
                
                .executeUpdate();
        manager.getTransaction().commit();
        manager.close();
        return result > 0;
	}

	

}
