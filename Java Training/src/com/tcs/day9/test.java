package com.tcs.day9;
interface I1{
	void sysout();
}
abstract class test {
	abstract void first();
	void second()
	{
		System.out.println("SECOND");
		first();
	}
}

abstract class B extends test
{
	void first()
	{
		System.out.println("FIRST");
		third();
	}
	abstract void third();
}

class C extends B
{
	void third()
	{
		System.out.println("THIRD");
	}
}
