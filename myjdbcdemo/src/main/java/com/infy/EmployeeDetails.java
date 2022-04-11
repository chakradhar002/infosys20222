package com.infy;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
public class EmployeeDetails {
	private static final Log LOGGER = LogFactory.getLog(EmployeeDetails.class);
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc_demo";
	// Provide your own database credentials
	static final String USER = "root";
	static final String PASS = "Vikram#2";
	public static void main(String[] args) throws ClassNotFoundException {
		Connection connection = null;
		Statement statement = null;
		try {
			// Registering the JDBC driver
			  LOGGER.info("connecting....");
			Class.forName(JDBC_DRIVER);
			// Opening a connection
			connection = DriverManager.getConnection(DB_URL, USER, PASS);
			  System.out.println("connected");
			  
			  LOGGER.info("connected....");
		
			connection.close();
		} catch (SQLException se) {
			System.out.println(se);
		} 
	}
}
