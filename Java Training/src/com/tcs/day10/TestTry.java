package com.tcs.day10;

public class TestTry {
	public static void main(String[] args)
	{
		String s="0";
		try
		{
			System.out.println(s.charAt(1));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("In catch block >>> i.e.,Exception raised");
			System.out.println("printing  e               >>>  "+e);
			System.out.println("printing  e.getmesssage() >>>>  "+e.getMessage());
		}
		finally
		{
			System.out.println("##Exception raised but finally block executed");
		}
		System.out.println();
		
		
		String str = "124";
		try
		{
			int i = Integer.parseInt(str);
			System.out.println("i = "+i);
			System.out.println("Try block successful without exception");
		}
		catch(NumberFormatException exception)
		{
			System.out.println(exception);
		}
		finally
		{
			
			System.out.println("##Finally block is executed");
		}
		
	}

}
