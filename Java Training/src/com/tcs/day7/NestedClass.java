package com.tcs.day7;

public class NestedClass {
	private static int i = 10;
	private int j = 20;
	public static void sOuter()
	{
		System.out.println("Inside static outer");
	}
	public void nSOuter()
	{
		System.out.println("Inside non static outer");
	}
	class Inner  //Non Static Class
	{
		public void display() 
		{
			System.out.println("From non static inner class  >>>>>>>>>>>>");
			System.out.println("i = "+i);
			System.out.println("j = "+j);
			sOuter();
			nSOuter();
			
		}
	}
	static class Inner1  //Static Class
	{
		public void display() 
		{
			System.out.println("From static inner1 class  >>>>>>>>>>>>");
			System.out.println("i = "+i);
		//	System.out.println("j = "+j);
			sOuter();
		//	nSOuter();
			
			
		}
	}
	public static void main(String[] args)
	{
		NestedClass o = new NestedClass();
		NestedClass.Inner i = o.new Inner();
		i.display();
		
		NestedClass.Inner1 j = new NestedClass.Inner1();
		j.display();
	}
}
