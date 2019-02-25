package com.Day16;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee16 e=new Employee16();
		e.name="Micheal Khan";
		e.address="Castle Street,Bangalore";
		e.SSN=11122333;
		e.number=101;
		try
		{
			FileOutputStream fileout=new FileOutputStream("D:/employee16.ser");
			ObjectOutputStream out=new ObjectOutputStream(fileout);
			out.writeObject(e);
			out.close();
			fileout.close();
			System.out.println("Serialized data is saved in employee16.ser");
			
		}
		catch(IOException i)
		{
			i.printStackTrace();
			//System.out.println(e1);
		}

	}

}
