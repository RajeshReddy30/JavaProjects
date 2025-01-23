package com.xworkz.tvshow.service;

import java.util.List;

import com.xworkz.tvshow.dto.TVShowActionDto;

public interface TVShowActionService {

    boolean saveTVShowAction(TVShowActionDto dto);

	List<TVShowActionDto> findAll();

	TVShowActionDto findById(int id);

	String deleteById(int id);

	String updateById(int id, TVShowActionDto dto);
}
