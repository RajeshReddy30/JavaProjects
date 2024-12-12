package com.xworkz.gaming.service;

import org.springframework.stereotype.Component;

import com.xworkz.gaming.dto.PlayerActionDto;

@Component
public class GameActionServiceImpl implements GameActionService {

    @Override
    public boolean savePlayerAction(PlayerActionDto dto) {
        if (dto != null) {
            if (dto.playerScore > 100 && dto.playerLevel > 0) {
                System.out.println("Player action saved successfully");
                return true;
            }
        }
        System.out.println("Player action failed");
        return false;
    }

	
}