package com.javaTraining;

public class GenericMethodTest {

	//generic method printArray
	public static <E> void printArray(E[] inputArray)
	
	{
	//display array element
		for(E element:inputArray) {
			System.out.printf("%s", element);
	
	}
		System.out.println();
		
		
}
	public static void main(String args[])
	{
		//create ARRAY OF integer,Double and character
		Integer[] intArray= {1,2,3,4,5};
		Double[] doubleArray= {1.1,2.2,3.3,4.4};
		Character[] charArray= {'H','E','L','L','o'};
		System.out.println("Array integerArray contains:");
		printArray(intArray);//pass an Integer Array
		
		System.out.println("\n Array doubleArray contains:");
		printArray(doubleArray);
		
		System.out.println("\n Array characterArray contains:");
		printArray(charArray);
		
	}
}