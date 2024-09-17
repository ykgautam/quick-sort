/*
 * java docs 
 * in this class inserting values in DB  using insert query  * 
 */

package io.yash.jdbc;

import java.sql.*;

public class JdbcDemo2 {

	public static void main(String[] args) throws Exception {
		String uname = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/test_database";

		int sid = 3;
		String sname = "arun";
		int sage = 35;
		String saddress = "pune";
		String semail = "arun@gmail.com";

		String squery = "insert into students values(?,?,?,?,?) ";

		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, uname, password);

		PreparedStatement statement = connection.prepareStatement(squery);

		statement.setInt(1, sid);
		statement.setString(2, sname);
		statement.setInt(3, sage);
		statement.setString(4, saddress);
		statement.setString(5, semail);

		int count = statement.executeUpdate();
		System.out.println(count + " row/s updated");

		statement.close();
		connection.close();
	}

}
