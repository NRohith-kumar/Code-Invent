package com.tcs.day13;

public class EmployeeLeft implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
			System.out.println("****Employee Retired from the job...");
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
	}

}
