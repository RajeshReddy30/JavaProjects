package maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadOperation {
	public static void main(String[] args) {
		try {

			Connection connection = DriverManager.getConnection(ConnectionUtil.JDBCURL, ConnectionUtil.USERNAME,
					ConnectionUtil.PASSWORD);
			System.out.println(connection);
			Statement statement = connection.createStatement();
			String read = "select * from rivers;";
			ResultSet resultSet = statement.executeQuery(read);

			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				System.out.println("id is:" + id);
				String name = resultSet.getString(2);
				System.out.println("names of river:" + name);
				String orgin = resultSet.getString(3);
				System.out.println("origin is:" + orgin);
				String state = resultSet.getString(4);
				System.out.println("state is:" + state);
				String length = resultSet.getString(5);
				System.out.println("length is:" + length);
				String width = resultSet.getString(6);
				System.out.println("width is:" + width);
				String area = resultSet.getString(7);
				System.out.println("area is:" + area);

			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}

}
