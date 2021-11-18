package com.tcs.day11;

public class SleepDemo implements Runnable{
	
		Thread t;
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for  (int i=0;i<4;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			try
			{
			//	Thread.yield();
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
	}
	
	public static void main(String[] args)
	{
		Thread t = new Thread(new SleepDemo());
		t.start();
		Thread t2 = new Thread(new SleepDemo());
		t2.start();
		
	}

}
