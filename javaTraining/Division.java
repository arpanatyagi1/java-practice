package com.javaTraining;
import java.util.*;


public class Division {
	public static void main(String[] args) {

	int a ,b ,result;
	Scanner sc=new Scanner(System.in);
	System.out.println("input two integer");
	a=sc.nextInt();
	b=sc.nextInt();
	try
	{
		result=a/b;
		System.out.print("Result:"+result);
		
	}
	catch(ArithmeticException e)
	{
		System.out.println("Exception caught:Division by Zero");
		
	}
	finally
	{
		sc.close();
		System.out.println("hii....");
	}
	
	}
	
}
