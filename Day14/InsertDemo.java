package com.Day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/classicmodels","root","root");
            /*String str="insert into offices values(9,'loni',9999777777,'lohia nagar','gzbd','Up','india',201001,'NA')";*/
             Statement stmt=con.createStatement();
            /* int rowcount=stmt.executeUpdate(str);
             if(rowcount>0)
             {
            	 System.out.println("Record Inserted Successfully");
            	 
             }
             String str1="Select count(officeCode) from offices";
            ResultSet rs=stmt.executeQuery(str1);
            while(rs.next())
            {
            	cnt=rs.getInt(1);
            	System.out.println("Total no of records is:"+cnt);
            
            }*/
            
            String str2="delete from offices where officeCode=8";
             cnt=stmt.executeUpdate(str2);
             if(cnt>0)
             {
            	 System.out.println("record deleted");
             }
             con.close();
            
            
            
            
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
