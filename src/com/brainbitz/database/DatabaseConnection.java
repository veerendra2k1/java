package com.brainbitz.database;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;

public class DatabaseConnection {

	Connection connection;

	public DatabaseConnection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			//connection = (Connection) DriverManager.getConnection("jdbc:mysql://gmaxgps.com:3306/gmaxgps_sample", "gmaxgps_admin","Veer@1983");
			//connection = (Connection) DriverManager.getConnection("jdbc:mysql://192.168.1.19:3306/billtest", "john","john");
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ksebdatabase", "root","root");

			if (connection == null) {
				System.out.println("database connection failed");
			} else {
				System.out.println("database connected");
			}

			selectQuery();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void selectQuery() {

		try {
			String query = "SELECT * FROM sample";
			
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = (ResultSet) preparedStatement.executeQuery();
			
			System.out.println(resultSet.toString());
			
		while (resultSet.next()) {
				String id = resultSet.getString("id");
				String name = resultSet.getString("name");
				System.out.println(id + " " + name);
			}
			
		} catch (SQLException exception) {
			System.out.println("catch");
			exception.printStackTrace();
		}

	}

	public static void main(String[] args) {

		new DatabaseConnection();
	}

}
