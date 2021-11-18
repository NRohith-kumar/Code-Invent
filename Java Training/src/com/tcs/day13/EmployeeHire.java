package com.tcs.day13;

public class EmployeeHire implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			Thread.sleep(1000);
			System.out.println("*Employee Hiring in process");
			System.out.println("*Hiring Successfull!!!");
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

}
