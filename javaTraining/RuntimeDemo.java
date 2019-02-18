package com.javaTraining;

public class RuntimeDemo {
	protected RuntimeDemo()
	{
		
	}
 public static void main(String args[])
 {
	 Runtime objRun=Runtime.getRuntime();
	 Process objProcess=null;
	 try
	 {
		 System.out.println(objRun.freeMemory());
	     objRun.gc();
	     System.out.println(System.getProperty("java.vendor"));
	     System.out.println(System.getProperty("java.vendor.url"));
	     System.out.println(System.getProperty("java.version"));
	     objProcess=objRun.exec("calc.exe");
		 
	 }
	 catch(Exception e)
	 {
		 System.out.println("Error executing calculator");
	 }
 }
}