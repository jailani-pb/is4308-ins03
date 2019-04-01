package week13.slot01.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectDatabase {

	public static boolean login(String username, String password) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =
				DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/ins03", "jailanihar", "Mypassword123-");
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(
					"SELECT * FROM users WHERE username='" + username + "' AND " +
							"password=SHA2('" + password + "',256)"
					);
			if(result.next()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}
	
}
