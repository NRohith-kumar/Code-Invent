package com.tcs.day12;

public class MyClass implements Runnable{
	public static void main(String[] args)
	{
		Thread thread0 = new Thread(new MyClass());
		Thread thread1 = new Thread(new MyClass());
		Thread thread2 = new Thread(new MyClass());
		thread0.start();
		thread1.start();
		thread2.start();
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		MyClass.print();
		MyClass.noAction();
	
	}
	public static synchronized void print()
	{
		//While one thread is accessing synchronized method all other running threads are paused or blocked until the running thread completes the whole synchronized block
		System.out.println("Inside PRINT Method >>> "+Thread.currentThread().getName());
		System.out.println("First Line");
		System.out.println("Second Line");
	}
	public static synchronized void noAction()
	{
		System.out.println("Inside NO ACTION Method accessed by >>> "+Thread.currentThread().getName());
	}

}
