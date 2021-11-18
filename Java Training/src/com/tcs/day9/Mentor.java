package com.tcs.day9;

public class Mentor {
	static int a = 10;
	static int b = 30;
	static
	{
		a =55;
		b=40;
	}
//	static int a = 10;
	public static void main(String[] args)
	{
		Mentor m = new Mentor();
		System.out.println(Mentor.a+"   "+Mentor.b);
	}
	
}
