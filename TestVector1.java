package com.javaTraining;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector1 {
	public static void main(String args[])
	{
		Vector<String> v=new Vector<String>();
		v.add("umesh");//method of collection
		v.addElement("John");//methos of vector
		v.addElement("Kumar");
		
		//traversing element using enumeration
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
	}

}
