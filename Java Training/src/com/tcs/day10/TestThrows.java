package com.tcs.day10;

public class TestThrows {
	public static void main(String[] args)
	{
		try
		{
			int result = convertString("123");
			System.out.println(result);
			int result1 = convertString("a12");
			System.out.println(result1);
		}
		catch(NumberFormatException exception)
		{
			System.out.println("Exception >>> "+exception.getMessage());
		}
	}
	public static int convertString(String a) throws NumberFormatException
	{
		int i = Integer.parseInt(a);
		System.out.println("Conversion Done!!!");
		return i;
	}
}
