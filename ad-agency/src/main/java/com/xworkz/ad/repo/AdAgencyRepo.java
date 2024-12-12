package com.xworkz.ad.repo;

import java.util.List;

import com.xworkz.ad.entity.AdAgencyEntity;

public interface AdAgencyRepo {

	void save(AdAgencyEntity enity);

	List<AdAgencyEntity> findAll();

	AdAgencyEntity authenticateUser(String email, int password);
	
}
