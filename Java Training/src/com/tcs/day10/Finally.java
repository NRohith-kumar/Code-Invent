package com.tcs.day10;

public class Finally {
	public static void main(String[] args)
	{
		int i = 10;
		int j = 0;
		try
		{
			int result = i/j;
			System.out.println("Result >>> "+result);
		}
		finally
		{
			System.out.println("In Final block with only try");
		}
		
	/*	String str = "";

		System.out.println(str.charAt(2));
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("In final block with only catch");
		}
		
	*/
	}

}
