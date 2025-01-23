package com.xworkz.gaming.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.gaming.dto.PlayerActionDto;
import com.xworkz.gaming.entity.GamingEntity;
import com.xworkz.gaming.repo.GamingRepo;

@Component
public class GameActionServiceImpl implements GameActionService {
	@Autowired
	private GamingRepo repo;

    @Override
    public boolean savePlayerAction(PlayerActionDto dto) {
    	GamingEntity entity=new GamingEntity();
        if (dto != null) {
            if (dto.playerScore > 100 && dto.playerLevel > 0) {
                System.out.println("Player action saved successfully");
                BeanUtils.copyProperties(dto, entity);
                repo.onSave(entity);
                return true;
            }
        }
        System.out.println("Player action failed");
        return false;
    }

    @Override
	public List<PlayerActionDto> findAll() {
		List<GamingEntity>entity=repo.findAll();
		return entity.stream().map(this::convertDto).collect(Collectors.toList());
	}
	public PlayerActionDto convertDto(GamingEntity entity) {
		PlayerActionDto dto=new PlayerActionDto();
		BeanUtils.copyProperties(entity, dto);
		return dto;
		
	}

	@Override
	public PlayerActionDto findById(int id) {
		GamingEntity entity = repo.findById(id);
        return entity != null ? convertDto(entity) : null;
	}

	@Override
	public String deleteById(int id) {
		boolean deleted = repo.deleteById(id);
        return deleted ? "Deleted successfully" : "Failed to delete";
	}

	@Override
	public String updateById(int id, PlayerActionDto dto) {
		GamingEntity entity = new GamingEntity();
	        if (dto != null) {
	            BeanUtils.copyProperties(dto, entity);
	            entity.setId(id); 
	            boolean updated = repo.updateById(id, entity);
	            return updated ? "Updated successfully" : "Failed to update";
	        }
	        return "Invalid data";
	}

	
}