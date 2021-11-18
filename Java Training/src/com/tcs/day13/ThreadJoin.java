package com.tcs.day13;

public class ThreadJoin {
	public static void main(String[] args) throws InterruptedException {
		Thread t0 = new Thread(new EmployeeHire());
		Thread t1 = new Thread(new EmployeeWork());
		Thread t2 = new Thread(new EmployeePromotion());
		Thread t3 = new Thread(new EmployeeLeft());
		System.out.println("Requirement Announced by project...");
		t0.start();
		t0.join();
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		
		
	
	
	}
	

}
