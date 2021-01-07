package io.yash.jdbc;

import java.sql.*;
//import com.mysql.jdbc.Connection;

public class SqlTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		
		String uname = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/test_database";
		String query = "select * from students";

		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, uname, password);
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);

		int id = 0;
		resultSet.next();
		id = resultSet.getInt(1);
		System.out.println(id);

		statement.close();
		connection.close();
		
		
		
		
		
		
		
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection connection  = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test_database","root","root");
//		Statement statement = connection.createStatement();
//		ResultSet resultSet = statement.executeQuery("select * from students");
//
//		
//		resultSet.next();
//		int id =resultSet.getInt("id");
//		System.out.println(id);
	}
}
