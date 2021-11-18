package com.tcs.day12;

public class Interrupt implements Runnable{
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new Interrupt());
		Thread t2 = new Thread(new Interrupt());
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread.currentThread();
		try
		{
			for (int i=0;i<5;i++)
			{
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName());
				Thread.currentThread().interrupt();
	
				Thread.currentThread();
				if(Thread.interrupted())
				{
					throw new InterruptedException("Thread Interrupted");
				}
			}
			
			
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
	}

}
