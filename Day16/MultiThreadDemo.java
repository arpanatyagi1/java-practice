package com.Day16;

class MultiThreadDemo
{
	public static void main(String args[])
	{
		int n=8;//number of threads
		for(int i=0;i<n;i++)
		{
			MultithreadingDemo object=new MultithreadingDemo();
			object.start();
		}
	}
}


