package com.xworkz.gaming.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data

public class PlayerActionDto {

	private int id;

	private String playerName;
	public int playerScore;
	public int playerLevel;
	private String actionType;
	public LocalDateTime actionTime;
}
