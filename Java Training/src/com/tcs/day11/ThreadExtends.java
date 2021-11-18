package com.tcs.day11;

public class ThreadExtends extends Thread{
	public void run() {
		System.out.println("In the ThreadExtends Class Run method");
	} 
	public void sleep() {
		System.out.println("Sleeping");
	}
	public static void main(String[] args)
	{
     	ThreadExtends myThread = new ThreadExtends();
		myThread.start();
		myThread.sleep();
		
	}
}
