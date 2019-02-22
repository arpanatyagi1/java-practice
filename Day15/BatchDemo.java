package com.Day15;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchDemo {
	
	
	 Connection con;
		ResultSet rs;
		Statement stmt;
		BatchDemo()
		{
			
		}
		void createConnection()
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc","root","root");
				stmt=con.createStatement();
				}
			catch(Exception e)
			
			{
			  System.out.println(e);
			}
		}
			
			void createBatch() throws SQLException
			{
				stmt.addBatch("insert into skills(name) values('Spring')");
				stmt.addBatch("update skills set name='varun' where id=4");
				stmt.addBatch("delete from skills where id=6");
				con.setAutoCommit(false);
				try
				{
					int i[]=stmt.executeBatch();
					con.commit();
					System.out.println("batch is successfully executed");
					}
				catch(Exception e)
				{
					    con.rollback();
						System.out.println("batch is failed");
					
				}
			}
			
			

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		BatchDemo bd=new BatchDemo();
		bd.createConnection();
		bd.createBatch();

	}

}
