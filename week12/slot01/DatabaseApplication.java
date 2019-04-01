package week12.slot01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseApplication {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =
			DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/ins03", "jailanihar", "Mypassword123-");
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery("SELECT * FROM students");
		while(result.next()) {
			System.out.println(result.getInt(1) + " " + result.getString(2) 
				+ " " + result.getString(3));
		}
	}
	
}
