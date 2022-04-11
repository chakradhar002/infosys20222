package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcDemo {
	static final String db_url="jdbc:mysql://localhost/mytestdb";
	static final String username="root";
	static final String password="";

	public static void main(String[] args) throws SQLException {
		try(Connection conn = DriverManager.getConnection(db_url, username, password)){
			System.out.println("connected");
			
		}catch(SQLException e){
			System.out.println(e);
			
		}
		

	}

}
