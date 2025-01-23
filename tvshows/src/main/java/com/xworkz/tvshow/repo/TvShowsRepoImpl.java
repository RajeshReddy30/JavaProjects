package com.xworkz.tvshow.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.tvshow.entity.TvShowsEntity;

@Component
public class TvShowsRepoImpl implements TvShowsRepo {
	@Autowired
private EntityManagerFactory factory;
	@Override
	public boolean onSave(TvShowsEntity entity) {
		if(entity!=null) {
			EntityManager manager= factory.createEntityManager();
			manager.getTransaction().begin();
			manager.persist(entity);
			manager.getTransaction().commit();
			manager.close();
		}
		return false;
	}
	@Override
	public List<TvShowsEntity> findAll() {
		EntityManager manager= factory.createEntityManager();
		TypedQuery<TvShowsEntity>query=manager.createNamedQuery("findall",TvShowsEntity.class);
		
		return query.getResultList();
	}

    @Override
    public TvShowsEntity findById(int id) {
        EntityManager manager = factory.createEntityManager();
        TypedQuery<TvShowsEntity> query = manager.createNamedQuery("findById", TvShowsEntity.class);
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
    public boolean updateById(int id,TvShowsEntity entity) {
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();
        int result = manager.createNamedQuery("updateById")
                .setParameter("id",id)
                .setParameter("tvShowName", entity.getShowName())
                .setParameter("ViewerName", entity.getViewerName())
                .setParameter("ActionType", entity.getActionType())
                .setParameter("CreatedBy", entity.getCreatedBy())
                .setParameter("CreatedOn", entity.getCreatedOn())
                
                .executeUpdate();
        manager.getTransaction().commit();
        manager.close();
        return result > 0;
    }
}

