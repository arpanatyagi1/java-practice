package com.Day15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamToFileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			InputStream is=new FileInputStream("D:\\arpana\\data.txt");
			OutputStream os=new FileOutputStream("sample.txt");
			byte[] buffer=new byte[1024];
			int bytesRead;
			while((bytesRead=is.read(buffer))!=-1)
			{
				os.write(buffer,0,bytesRead);
			}
			
			System.out.println("file copied");
			is.close();
			os.flush();
			os.close();
			
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	

	}

}
