package com.xworkz.gaming.repo;

import java.util.List;

import com.xworkz.gaming.entity.GamingEntity;

public interface GamingRepo {
	boolean onSave(GamingEntity entity);

	List<GamingEntity> findAll();
	GamingEntity findById(int id);

	boolean deleteById(int id);

	boolean updateById(int id, GamingEntity entity);

}
