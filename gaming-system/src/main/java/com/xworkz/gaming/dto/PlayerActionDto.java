package com.xworkz.gaming.dto;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class PlayerActionDto {

	private String playerName;
	public int playerScore;
	public int playerLevel;
	private String actionType;
	public LocalDateTime actionTimestamp;
}
