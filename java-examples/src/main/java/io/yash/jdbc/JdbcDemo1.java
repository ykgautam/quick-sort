package io.yash.jdbc;

import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;

public class JdbcDemo1 {

	public static void main(String[] args) throws Exception {
		String uname = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/test_database";
		String query = "select * from students where id=10";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, uname, password);
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);
		
		String studedentData = "";
		
		while(resultSet.next()) {
			studedentData = resultSet.getInt(1) + " " + resultSet.getString(2);
			System.out.println(studedentData);
		}
		
		statement.close();
		connection.close();

	}

}
