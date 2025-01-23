package com.xworkz.gaming.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import lombok.Data;
@Entity
@Data
@NamedQuery(name="findall", query="Select x from GamingEntity x")
@NamedQuery(name = "findById", query = "SELECT x FROM GamingEntity x WHERE x.id = :id")
@NamedQuery(name = "deleteById", query = "DELETE FROM GamingEntity x WHERE x.id = :id")
@NamedQuery(name = "updateById", query = "UPDATE GamingEntity x SET x.playerName = :playerName, x.playerScore = :playerScore, x.playerLevel = :playerLevel, x.actionType = :actionType, x.actionTime = :actionTime WHERE x.id = :id")
public class GamingEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String playerName;
	public int playerScore;
	public int playerLevel;
	private String actionType;
	public LocalDateTime actionTime;

}
