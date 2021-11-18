package com.tcs.day10;

public class TestThrow {
	public static void main(String[] args)
	{
		System.out.println("Setting Pin1");
		int pin1 = 123456;
		checkPin(pin1);
		
		System.out.println("\nSetting Pin2");
		int pin2 = 654321;
		checkPin(pin2);
		
		System.out.println("\nSetting Pin3");
		int pin3 =123456789;
		checkPin(pin3);
	}
	public static void checkPin(int pin)
	{
		if (pin < 100000 || pin >= 1000000)
		{
			throw new ArithmeticException("Pin should contain 6 digits");
		}
		else
		{
			System.out.format("Pin is Set Successfully!!!");
		}
	}

}
