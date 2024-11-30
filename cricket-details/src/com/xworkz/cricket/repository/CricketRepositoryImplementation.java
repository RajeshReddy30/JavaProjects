package com.xworkz.cricket.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.cricket.dto.CricketDto;
import com.xworkz.cricket.util.CricketUtil;

public class CricketRepositoryImplementation implements CricketRepository {

	@Override
	public boolean save(CricketDto dto) {
		try {
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
		} catch (SQLException e) {
			System.out.println(e.getMessage());
             e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<CricketDto> read() {
		List<CricketDto> list=new ArrayList<CricketDto>();
		try {
			Connection connection = DriverManager.getConnection(CricketUtil.JDBCURL, CricketUtil.USERNAME,
					CricketUtil.PASSWORD);
			String readQuery="select * from cricket";
			Statement statements=connection.createStatement();
			ResultSet result=statements.executeQuery(readQuery);
			while(result.next()) {
				CricketDto dtos=new CricketDto();
				dtos.setId(result.getInt(1));
				dtos.setTeamName(result.getString(2));
				dtos.setTeamBoard(result.getString(3));
				dtos.setCaptain(result.getString(4));
				dtos.setCoach(result.getString(5));
				dtos.setMatchesPlayed(result.getInt(6));
				dtos.setMatchesWon(result.getInt(7));
				dtos.setWorldCupsWon(result.getInt(8));
				list.add(dtos);
				
			}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return list;
	}

    @Override
    public CricketDto searchById(int id) {
    	CricketDto   search = new CricketDto();
        try {
        	Connection connection = DriverManager.getConnection(CricketUtil.JDBCURL, CricketUtil.USERNAME, CricketUtil.PASSWORD);
            String query = "SELECT * FROM cricket WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
            	
            	search.setId(resultSet.getInt("id"));
            	search.setTeamName(resultSet.getString("team_name"));
            	search.setTeamBoard(resultSet.getString("team_board"));
            	search.setCaptain(resultSet.getString("captain"));
            	search.setCoach(resultSet.getString("coach"));
            	search.setMatchesPlayed(resultSet.getInt("matchesPlayed"));
            	search.setMatchesWon(resultSet.getInt("matchesWon"));
            	search.setWorldCupsWon(resultSet.getInt("worldCupsWon"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return search;
    }

	@Override
	public boolean delete(int id) {
		try {
			Connection connection=DriverManager.getConnection(CricketUtil.JDBCURL,CricketUtil.USERNAME,CricketUtil.PASSWORD);
			String delete="delete from cricket where id=?";
			PreparedStatement statement=connection.prepareStatement(delete);
			statement.setInt(1, id);
			if(!statement.execute()) {
				return true;
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
    


}
