package com.myapp.Shopping_Simplified;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class DatabaseHelper {
	    private static final String URL = "jdbc:mysql://localhost:3306/product_comparison";
	    private static final String USER = "root"; // Your MySQL username
	    private static final String PASSWORD = "root"; // Your MySQL password
	    private Connection connection;

	    public DatabaseHelper() {
	        connect();
	    }

	    private void connect() {
	        try {
	            connection = DriverManager.getConnection(URL, USER, PASSWORD);
	            System.out.println("Connected to the database!");
	        } catch (SQLException e) {
	            System.out.println("Database connection failed!");
	            e.printStackTrace();
	        }
	    }

	    public void insertProduct(String name, String price) {
	        String query = "INSERT INTO products (name, price) VALUES (?, ?)";
	        try (PreparedStatement stmt = connection.prepareStatement(query)) {
	            stmt.setString(1, name);
	            stmt.setString(2, price);
	            stmt.executeUpdate();
	            System.out.println("Product inserted into the database!");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}


