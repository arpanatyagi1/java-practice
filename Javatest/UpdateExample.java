package com.Javatest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



 class UpdateRecord {
	Connection con;

	PreparedStatement pstmt;
	ResultSet rs;
	void createConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc","root","root");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
		public void update(int a, String s) throws SQLException
		{
			 PreparedStatement stmt=con.prepareStatement("Update candidates set first_name=? where id=?");
		        stmt.setString(1,"");
		        stmt.setInt(2, 1);
		        int i=stmt.executeUpdate();
		        if(i>0)
		        {
		        	System.out.println("update successfully");
		        }
		        
		}
			
		}
class UpdateExample
{
	public static void main(String args[]) throws SQLException
	{
	UpdateRecord u=new UpdateRecord();
	u.createConnection();
	u.update(2,"bharti");
	}
}
	
      

