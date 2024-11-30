package maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionRunner {
	public static void main(String[] args) {
		System.out.println("JDBC connection");
		
			try {
				Class.forName(ConnectionUtil.DRIVERNAME);
				Connection connection=DriverManager.getConnection(ConnectionUtil.JDBCURL,ConnectionUtil.USERNAME,ConnectionUtil.PASSWORD);
System.out.println(connection);
Statement createStatement = connection.createStatement();
String query="INSERT INTO rivers (id, river_name, origin, state, length, width, area) \r\n"
		+ "VALUES\r\n"
		+ "  (11, 'Ganga', 'Gangotri Glacier', 'Uttarakhand', 2525, 1500, 1050000),\r\n"
		+ "  (12, 'Yamuna', 'Yamunotri Glacier', 'Uttarakhand', 1376, 1200, 600000),\r\n"
		+ "  (3, 'Brahmaputra', 'Tibetan Plateau', 'Arunachal Pradesh', 2900, 1500, 1100000),\r\n"
		+ "  (4, 'Indus', 'Tibetan Plateau', 'Ladakh', 3180, 1200, 1200000),\r\n"
		+ "  (5, 'Godavari', 'Trimbak Plateau', 'Maharashtra', 1465, 1200, 700000),\r\n"
		+ "  (6, 'Narmada', 'Amarkantak Plateau', 'Madhya Pradesh', 1312, 1000, 500000),\r\n"
		+ "  (7, 'Krishna', 'Mahabaleshwar', 'Maharashtra', 1400, 1100, 800000),\r\n"
		+ "  (8, 'Mahanadi', 'Chhattisgarh', 'Chhattisgarh', 858, 800, 400000),\r\n"
		+ "  (9, 'Sarasvati', 'Sarasvati River Basin', 'Haryana', 1500, 500, 300000),\r\n"
		+ "  (10, 'Kaveri', 'Talacauvery', 'Karnataka', 805, 600, 300000);";
		
		
		 
boolean result=createStatement.execute(query);
if(!result) {
	System.out.println("saved successfully");
}else {
	System.out.println("not saved ");
}



			} catch (ClassNotFoundException |SQLException e) {
				
				e.printStackTrace();
			}
		
	}

}
