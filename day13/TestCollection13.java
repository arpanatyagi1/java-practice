package com.day13;

import java.util.HashMap;
import java.util.Map;

public class TestCollection13 {

	private static final String HashMap = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(111, "John");
		hm.put(222,"JIm");
		hm.put(333, "Mike");
		
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		

	}

}
