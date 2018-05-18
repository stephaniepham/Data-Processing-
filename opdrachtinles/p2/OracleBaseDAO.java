package week2.opdrachtinles.p2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleBaseDAO {
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@//localhost:1521/xe";
		String name = "test";
		String password = "test";

		Connection con = DriverManager.getConnection(url, name, password);
		return con;
	}
}