package com.xworkz.tvshow.repo;

import java.util.List;

import com.xworkz.tvshow.entity.TvShowsEntity;

public interface TvShowsRepo {

	boolean onSave(TvShowsEntity entity);
	List<TvShowsEntity>findAll();
    TvShowsEntity findById(int id);

    boolean deleteById(int id);

    boolean updateById(int id, TvShowsEntity entity);

}
