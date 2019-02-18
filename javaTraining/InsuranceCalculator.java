package com.javaTraining;

public class InsuranceCalculator {

	public static void main(String[] args) {
		//D TOO Auto-generated method stub
	InsuranceRate obj=new InsuranceRate();
	String inData="2000";
	try
	{
		System.out.println("Your insurance is:"+obj.calculateRate(inData));
		
	}
	catch(Exception oops)
	{
		System.out.println("too young for insurance!");
		
	}

	}

}
