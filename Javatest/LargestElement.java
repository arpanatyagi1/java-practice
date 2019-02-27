package com.Javatest;

import java.util.Arrays;


public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[]ia= {10,9,6,5,4,3,7,2};
		Double[]ar= {3.3,4.2,1.5,2.9,6.0,5.4,9.3,7.2,8.6};
		Character[]car= {'a','c','z','b','k','f','d','g'};
		findmaximum(ia);
		findmaximum(ar);
		findmaximum(car);
	}
	
	
	 public static < E > void findmaximum( E[] inputArray ) {
		 
		Arrays.sort(inputArray, 0, inputArray.length);
		
		System.out.println("largest in "+inputArray.getClass().getSimpleName()+" is: "+inputArray[inputArray.length-1]);
		System.out.println();
	 }

}