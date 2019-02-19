package com.javaTraining;

import java.util.ArrayList;
import java.util.Collections;

public class MyBasicArrayList {
	public static void main(String args[])
	{
		
	
 ArrayList<String> ar=new ArrayList<String>();
 ar.add("c");
 ar.add("java");
 ar.add("c++");
 ar.add("python");
 ar.add("net");
 
 
 for(String s:ar)
 {
	 System.out.println(s);
 }
 
 System.out.println("Element at index 1:"+ar.get(1));
 System.out.println("index of java "+ar.indexOf("java"));
 ar.add(2,"play");
 System.out.println(ar);
 System.out.println("is arraylist empty:"+ar.isEmpty());
 System.out.println("size of the array list:"+ar.size());
 Collections.sort(ar);
 System.out.println(ar);
 
 
	}
}
