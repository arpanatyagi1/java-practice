package com.Day15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			BufferedReader br=new BufferedReader(new FileReader(new File("D:\\arpana\\data.txt")));
			String line=" ";
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
			}
			br.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file not exists or insufficient ");
			e.printStackTrace();
			}
		catch(IOException e)
		{
			System.out.println("An exception occured while reading the file");
		    e.printStackTrace();
		}

	}

}
