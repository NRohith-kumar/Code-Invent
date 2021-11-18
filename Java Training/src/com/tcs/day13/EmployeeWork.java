package com.tcs.day13;

public class EmployeeWork implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try
		{
			Thread.sleep(1000);
			System.out.println("**Employee working!!!");
			System.out.println("**Salary processing Successful!!!");
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
		
	}

}
