package com.xworkz.cricket.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.cricket.dto.CricketDto;
import com.xworkz.cricket.util.CricketUtil;



public class CricketRepositoryImplementation implements CricketRepository {

	@Override
	public boolean save(CricketDto dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(CricketUtil.JDBCURL, CricketUtil.USERNAME,
					CricketUtil.PASSWORD);
			String query = "insert into cricket(team_name,team_board,captain,coach,matchesPlayed,matchesWon,worldCupsWon) values (?,?,?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, dto.getTeamName());
			statement.setString(2, dto.getTeamBoard());
			statement.setString(3, dto.getCaptain());
			statement.setString(4, dto.getCoach());
			statement.setInt(5, dto.getMatchesPlayed());
			statement.setInt(6, dto.getMatchesWon());
			statement.setInt(7, dto.getWorldCupsWon());
			//statement.setInt(8, dto.getWorldCupsWon());
			
			if (!statement.execute()) {
				return true;
			}
		} catch (ClassNotFoundException|SQLException e) {
			System.out.println(e.getMessage());
             e.printStackTrace();
		}
		return false;
	}


}
