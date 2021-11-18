package com.tcs.day4;

public class multiplicationApplication {
	public static void main(String[] args)
	{
		multiple m = new multiple();
		int a = m.mul(6,10);
		int b = m.mul(10,6,5);
		System.out.println("a*b = : "+a);
		System.out.println("a*b*c = :"+b);
	}

}
