package com.Day16;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializedDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Employee16 e=null;
		try
		{
			FileInputStream fileIn=new FileInputStream("D:/employee16.ser");
			ObjectInputStream in= new ObjectInputStream(fileIn);
			e=(Employee16)in.readObject();
			//System.out.println("Helooooooooooo");
			
			in.close();
			fileIn.close();
			
			
		}
       catch(IOException i)
		
		{
    	   i.printStackTrace();
    	   return;
		}
		System.out.println("Deserialized Employee16");
		System.out.println("Name="+e.name);
		System.out.println("Address:"+e.address);
		System.out.println("SSN="+e.SSN);
		System.out.println("Number="+e.number);
	}

}
