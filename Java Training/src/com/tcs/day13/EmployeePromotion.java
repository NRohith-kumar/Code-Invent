package com.tcs.day13;

public class EmployeePromotion implements Runnable{

	@Override
	public void run(){
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
			System.out.println("***Congratulations!!");
			System.out.println("***Employee Promoted");
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

}
