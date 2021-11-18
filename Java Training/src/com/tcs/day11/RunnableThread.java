package com.tcs.day11;
import java.lang.Thread;
public class RunnableThread implements Runnable{
	public static void main(String[] args) throws InterruptedException
	{

		Thread thread0 = new Thread(new RunnableThread());
		Thread thread1 = new Thread(new RunnableThread());
		
		thread0.start();
		thread0.join();
		thread1.start();
		//System.out.println("State  >>> "+thread1.getState());
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread.currentThread();
		
		try {
			Thread.currentThread();
			Thread.yield();
			Thread.sleep(1000);
			System.out.println("State of "+Thread.currentThread().getName()+" is "+Thread.currentThread().getState());
			System.out.println("Inside The Run Method"+Thread.currentThread().getName());
			System.out.println("Priority is >>> "+Thread.currentThread().getPriority());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
