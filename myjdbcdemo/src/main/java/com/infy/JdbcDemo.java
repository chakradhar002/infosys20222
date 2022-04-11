package com.infy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
   // connecting to h2 databse
public class JdbcDemo{
	    // url for connecting h2 db
	//static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	  static final  String db_url ="jdbc:h2:~/test";
	     // user name of h2 db
	  static final String username ="sa";
	     // password of h2 db
	 static final String passsword ="".trim();
	
    public static void main( String[] args ) throws Exception {
    	System.out.println("connecting...");
    	// loading diver of h2 database
    	Class.forName("org.h2.Driver");
    	 //// established the connetion
    //	try (Connection conn =DriverManager.getConnection("jdbc:h2:~/test", username, passsword)){
    		System.out.println("connected");
    		
    ////	}catch(SQLException q) {
    		
    		//System.out.println(q);
    	}
        
    }
//}
