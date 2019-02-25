package com.Day16;
 class Count extends Thread
{
	Count()
	{
		super("my extend thread");
		System.out.println("my thread created"+this);
		start();
		
	}
	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("printing the count"+i);
				Thread.sleep(1000);
				
			}
		}
		catch(Exception e)
		{
			System.out.println("my thread interrupted");
		}
		System.out.println("my thread run is over");
	}
}
public class ExtendingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count cnt=new Count();
		try
		{
			while(cnt.isAlive())
			{
				System.out.println("main thread will be alive till the chile thread is live");
				Thread.sleep(1500);
			}
		}
		catch(InterruptedException e)
		{
		System.out.println("main thread interrupted");	
		}
		
	}

}
