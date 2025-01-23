package com.xworkz.gaming.service;

import java.util.List;

import com.xworkz.gaming.dto.PlayerActionDto;
import com.xworkz.gaming.entity.GamingEntity;

public interface GameActionService {

    boolean savePlayerAction(PlayerActionDto dto);
    List<PlayerActionDto>findAll();
    PlayerActionDto findById(int id);

	String deleteById(int id);

	String updateById(int id, PlayerActionDto dto);
}
