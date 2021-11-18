package com.tcs.day6;

public class Application {
	public static void main(String[] args)
	{
		Singleton x = Singleton.createObject();
		Singleton y = Singleton.createObject();
		Singleton a = Singleton.createObject();
		Singleton z = Singleton.createObject();
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(z);


	}

}
