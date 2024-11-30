package com.xworkz.gadget.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.gadget.dto.GadgetDto;
import com.xworkz.gadget.util.GadgetUtil;

public class GadgetRepoImplementation implements GadgetRepo {

	@Override
	public boolean save(GadgetDto dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(GadgetUtil.JDBCURL, GadgetUtil.USERNAME,
					GadgetUtil.PASSWORD);
			String query = "insert into gadget_details(gadgetId,gadgetName,gadgetType) values (?,?,?)";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(2, dto.getGadgetName());
			statement.setString(3, dto.getGadgetType());

			statement.setInt(1, dto.getGadgetId());

			if (!statement.execute()) {
				return true;
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<GadgetDto> read() {
		List<GadgetDto> list = new ArrayList<GadgetDto>();
		try {
			Connection connection = DriverManager.getConnection(GadgetUtil.JDBCURL, GadgetUtil.USERNAME,
					GadgetUtil.PASSWORD);

			String readQuery = "select * from gadget_details";
			Statement statements = connection.createStatement();
			ResultSet result = statements.executeQuery(readQuery);
			while (result.next()) {
				GadgetDto dtos = new GadgetDto();
				dtos.setId(result.getInt(1));
				dtos.setGadgetId(result.getInt(2));
				dtos.setGadgetName(result.getString(3));
				dtos.setGadgetType(result.getString(4));
				list.add(dtos);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;

	}

	@Override
	public boolean deleteById(int id) {
		try {
			Connection connection = DriverManager.getConnection(GadgetUtil.JDBCURL, GadgetUtil.USERNAME,
					GadgetUtil.PASSWORD);
			String delete = "delete from  gadget_details where id=?";
			PreparedStatement statement = connection.prepareStatement(delete);
			statement.setInt(1, id);
			if (!statement.execute()) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	@Override
	public GadgetDto searchById(int id) {
		GadgetDto search = new GadgetDto();
		try {
			Connection connection = DriverManager.getConnection(GadgetUtil.JDBCURL, GadgetUtil.USERNAME,
					GadgetUtil.PASSWORD);
			String query = "SELECT * FROM gadget_details WHERE id = ?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();

			if (resultSet.next()) {

				search.setId(resultSet.getInt("id"));
				search.setGadgetId(resultSet.getInt("gadgetId"));
				search.setGadgetName(resultSet.getString("gadgetName"));
				search.setGadgetType(resultSet.getString("gadgetType"));

			}
		} catch (SQLException e) {
			e.getMessage();
		}
		return search;

	}

	@Override
	public boolean updateById(int id, GadgetDto dto) {
		GadgetDto dtos=new GadgetDto();
			try {
				//Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection(GadgetUtil.JDBCURL, GadgetUtil.USERNAME,
						GadgetUtil.PASSWORD);
				String query="update gadget_details set gadgetId=?,gadgetName=?,gadgetType=? where id=?";
				PreparedStatement statement=connection.prepareStatement(query);
				
				statement.setInt(4,id);
				statement.setInt(1,dto.getGadgetId());
				statement.setString(2,dto.getGadgetName());
				statement.setString(3, dto.getGadgetType());
				int result=statement.executeUpdate();
				if(result>0) {
					return true;
				}
			}catch(Exception e) {
					e.getMessage();
				}
			return false;
	
			
	}


}
