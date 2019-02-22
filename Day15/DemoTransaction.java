package com.Day15;

import java.sql.DriverManager;
import java.sql.*;

public class DemoTransaction {

	public static void main(String args[])throws Exception
	{

		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc","root","root");
		System.out.println("driver is loaded");
		Statement stmt=con.createStatement();
		con.setAutoCommit(false);
		try
		{
			int i1=stmt.executeUpdate("insert into candidate_skills values(101,4)");
			int i2=stmt.executeUpdate("update skills set name='ruby' where id=7");
			int i3=stmt.executeUpdate("delete from candidates where id=0");
			con.commit();
			System.out.println("Transaction is success");
			}
		catch(Exception e)
		{
			try {
				con.rollback();
				System.out.println("hii transaction is failed");
				
			}
			catch(Exception ex)

			{
				System.out.println(ex);
			}
			
		}
	}

}
