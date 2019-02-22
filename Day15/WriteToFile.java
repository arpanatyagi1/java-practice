package com.Day15;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	
	public static void main(String args[])
	{
		try
		{
			FileWriter writer =  new FileWriter("D:\\arpana\\data.txt",true);
			BufferedWriter bwr=new BufferedWriter(writer);
			bwr.write("James");
			bwr.write("\t");
			bwr.write("Hobert");
			bwr.close();
			
			System.out.println("Successfully written to a file");
		}
		catch(IOException ioe)
		{			
			ioe.printStackTrace();
		}
	}

}
