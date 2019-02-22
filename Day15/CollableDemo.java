package com.Day15;

import java.sql.*;

public class CollableDemo {
	 Connection con;
	ResultSet rs;
	CallableStatement cstmt;
	CollableDemo()
	{
		
	}
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
	public void getSkills(int candidateId)
	{
		String query = "{call get_candidate_skill(?)}";
		ResultSet rs;
		try {
			CallableStatement stmt=con.prepareCall(query);
			stmt.setInt(1, candidateId);
			rs=stmt.executeQuery();
			while(rs.next())
			{
				System.out.println(String.format("%s -%s", rs.getString("first_name")+" "+rs.getString("last_name"),rs.getString("skill")));
				
			}//first s is for firstname and lastname and second for skills
			
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void main(String args[])
	{
		CollableDemo cd=new CollableDemo();
		cd.createConnection();
		cd.getSkills(133);
		}
}


