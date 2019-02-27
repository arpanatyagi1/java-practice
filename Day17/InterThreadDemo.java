package com.Day17;

public class InterThreadDemo {

	public static void main(String[] args) {
		final Customer1 c=new Customer1();
		new Thread()
		{
			public void run()
			{
				c.withdraw(15000);
				
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				c.deposit(10000);
			}
		}.start();
		new Thread()
		{
			public void run()
			{
			c.deposit(10000);
			}
		}.start();

	}

}
class Customer1
{
	int amount=10000;
	synchronized void withdraw(int amount)
	{
		System.out.println("Avaialable Balance"+this.amount);
		System.out.println("Goind to withdraw"+amount);
		if(this.amount<amount)
		{
			System.out.println("Insufficient Balance waiting for deposit");
			try
			{
				wait();
			}
			catch(Exception e)
			{
				System.out.println("Interrupted Occured");
			}
		}
		this.amount-=amount;
		System.out.println("Detected amount:"+amount);
		System.out.println("Balance amount:"+this.amount);
	}
	synchronized void deposit(int amount)
	{
		System.out.println("Going to deposite"+amount);
		this.amount+=amount;
		System.out.println("Available Balance"+this.amount);
		System.out.println("Transaction completed\n");
		notify();
	}



}
