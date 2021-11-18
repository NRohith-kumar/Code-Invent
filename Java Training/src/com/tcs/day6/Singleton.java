package com.tcs.day6;

public class Singleton {
	private static Singleton a;
	private Singleton()
	{
		System.out.println("In the constructor");
	}
	public static Singleton createObject()
	{
		if (a == null)
		{
			System.out.println("Creating instance");
			a = new Singleton();
			return a;
		}
		else 
		{
			return a;
		}
		
		
	}
}
