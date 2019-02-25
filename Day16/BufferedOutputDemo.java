package com.Day16;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fout=new FileOutputStream("D:/f1.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		String s="Sachin is my favourite player";
		byte b[]=s.getBytes();
		bout.write(b);
		bout.flush();
		fout.close();
		System.out.println("Success");

	}

}
