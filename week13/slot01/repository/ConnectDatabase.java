package week13.slot01.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import week13.slot01.model.Product;

public class ConnectDatabase {

	public static boolean login(String username, String password) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =
				DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/ins03", "jailanihar", "Mypassword123-");
//			Statement statement = connection.createStatement();
//			ResultSet result = statement.executeQuery(
//					"SELECT * FROM users WHERE username='" + username + "' AND " +
//							"password=SHA2('" + password + "',256)"
//					);
			String sql = "SELECT * FROM users WHERE username=? AND " + 
							"password=SHA2(?,256)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, username);
			statement.setString(2, password);
			ResultSet result = statement.executeQuery();
			if(result.next()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}
	
	public static void 
		addProduct(String name, double price, String category, boolean inStock) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =
					DriverManager.getConnection(
							"jdbc:mysql://localhost:3306/ins03", "jailanihar", "Mypassword123-");
			String sql = "INSERT INTO products (name, price, category, in_stock) "
					+ "VALUES (?, ?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, name);
			statement.setDouble(2, price);
			statement.setString(3, category);
			statement.setBoolean(4, inStock);
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static List<Product> getAllProducts() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =
					DriverManager.getConnection(
							"jdbc:mysql://localhost:3306/ins03", "jailanihar", "Mypassword123-");
			String sql = "SELECT * FROM products";
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet result = statement.executeQuery();
			ArrayList<Product> productsList = new ArrayList<Product>();
			while(result.next()) {
				Product product = new Product(
						result.getString(1),
						result.getDouble(2),
						result.getString(3),
						result.getBoolean(4)
						);
				productsList.add(product);
			}
			return productsList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
