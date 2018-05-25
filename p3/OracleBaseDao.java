package week3.inleveropdracht.p3;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleBaseDao {

	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String driverName = "oracle.jdbc.driver.OracleDriver";
	private static String username = "pham";
	private static String password = "Autodrop27";
	private static Connection con;

	public static Connection getConnection() {
		try {
			Class.forName(driverName);
			try {
				con = DriverManager.getConnection(url, username, password);
			} catch (SQLException ex) {
				// log an exception. from example:
				System.out.println("Failed to create the database connection.");
			}
		} catch (ClassNotFoundException ex) {
			// log an exception. for example:
			System.out.println("Driver not found.");
		}
		return con;
	}
}