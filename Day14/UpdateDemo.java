package com.Day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {

	public static void main(String[] args) {
		try {
			
		
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/classicmodels","root","root");
        PreparedStatement stmt=con.prepareStatement("Update offices set state=? where officeCode=?");
        stmt.setString(1, "up");
        stmt.setInt(2, 2);
        int i=stmt.executeUpdate();
        if(i>0)
        {
        	System.out.println("update successfully ");
        }
        
	}
		catch(Exception e)
		{
			System.out.println(e);
		}

}
}
