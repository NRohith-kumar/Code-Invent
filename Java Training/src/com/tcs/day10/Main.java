package com.tcs.day10;

public class Main {
	public static void main(String[] args)
	{
		try
		{
			
		System.out.println("Setting pin1");
		int pin1 = 123456;
		check(pin1);
		
		System.out.println("Setting Pin2");
		int pin2 = 1234456789;
		check(pin2);
		System.out.println("Pin2 set Successfully");
		}
		catch(CustomException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	public static void check(int i) throws CustomException 
	{
		if (i < 100000 || i >= 1000000)
		{
			throw new CustomException("\nEnter Valid 6 digit pin");
		}
		else
		{
			System.out.println("Pin is set successfully!!!");
		}
	}
	
	

}
