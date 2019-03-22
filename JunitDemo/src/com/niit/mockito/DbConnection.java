package com.niit.mockito;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

		// TODO Auto-generated method stub
		
			private Connection dbConnection;
			 
			  public void getDBConnection() throws ClassNotFoundException, SQLException {
				  Class.forName("com.mysql.jdbc.Driver");
				  dbConnection=DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc","root","root");
			  }
			 
			  public int executeQuery(String query) throws ClassNotFoundException, SQLException {
			    return dbConnection.createStatement().executeUpdate(query);
			  }
	}


