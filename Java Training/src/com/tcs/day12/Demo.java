package com.tcs.day12;

public class Demo extends Abstract implements Interface1,Interface2{
	public static void main(String[] args)
	{
		Demo d = new Demo();
		d.m1();
		d.m2();
		d.m3();
		d.m4();
		d.m5();
		d.method1();
		d.method2();
		d.method3();
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("Method 4 from Interface2");
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		System.out.println("Method 5 from Interface2");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("It is compulsory to implement ALL the methods of every interface that is implemented in SubClass");
		System.out.println("Method 1 from Interface1");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("Method 2 from Interface1");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("Method 3 from Interface1");
	}

	@Override
	void method1() {
		// TODO Auto-generated method stub
		System.out.println("Method 1 From Abstract Class");
	}

	@Override
	void method2() {
		// TODO Auto-generated method stub
		System.out.println("Method 2 From Abstract Class");
	}
}
