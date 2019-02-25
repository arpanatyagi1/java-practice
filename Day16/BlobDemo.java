package com.Day16;
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;

public class BlobDemo {
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
	public void writeBlob(int candidateId, String filename)
	{
		String updateSQL="update candidates set resume=? where id=?";
		try
		{
			pstmt=con.prepareStatement(updateSQL);
		  File file=new File(filename);
		  FileInputStream input=new FileInputStream(file);
		  pstmt.setBinaryStream(1,input);
		  pstmt.setInt(2, candidateId);
		  
		  System.out.println("Reading file"+file.getAbsolutePath());
		  System.out.println("store file in the database");
		  pstmt.executeUpdate();
		  con.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+e);
		}
				
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlobDemo bd1=new BlobDemo();
		bd1.createConnection();
		bd1.writeBlob(133,"Johndoe_resume.pdf");

	}

}
