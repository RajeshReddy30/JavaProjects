package com.xworkz.tvshow.service;



import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.tvshow.dto.TVShowActionDto;
import com.xworkz.tvshow.entity.TvShowsEntity;
import com.xworkz.tvshow.repo.TvShowsRepo;

@Component
public class TVShowActionServiceImpl implements TVShowActionService {
	@Autowired
	private TvShowsRepo repo;

    @Override
    public boolean saveTVShowAction(TVShowActionDto dto) {
        if (dto != null) {
            if (dto.getViewingTime() > 0 && dto.getActionType() != null && !dto.getActionType().isEmpty()) {
                System.out.println("TV Show action saved successfully");
                return true;
            }
        }
        System.out.println("TV Show action failed");
        return false;
    }

	@Override
	public List<TVShowActionDto> findAll() {
		List<TvShowsEntity>entity=repo.findAll();
		return entity.stream().map(this::convertDto).collect(Collectors.toList());	}

	@Override
	public TVShowActionDto findById(int id) {
		TvShowsEntity entity = repo.findById(id);
        return entity != null ? convertDto(entity) : null;
		
	}
	public TVShowActionDto convertDto(TvShowsEntity entity) {
		TVShowActionDto dto=new TVShowActionDto();
		BeanUtils.copyProperties(entity, dto);
		return dto;
		
	}

	@Override
	public String deleteById(int id) {
		 boolean deleted = repo.deleteById(id);
	        return deleted ? "Deleted successfully" : "Failed to delete";
	}

	@Override
	public String updateById(int id, TVShowActionDto dto) {
		  TvShowsEntity entity = new TvShowsEntity();
	        if (dto != null) {
	            BeanUtils.copyProperties(dto, entity);
	            entity.setId(id); 
	            boolean updated = repo.updateById(id, entity);
	            return updated ? "Updated successfully" : "Failed to update";
	        }
	        return "Invalid data";
	}
}
