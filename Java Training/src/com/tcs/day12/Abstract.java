package com.tcs.day12;

public abstract class Abstract {
	abstract void method1();
	abstract void method2();
	void method3() {
		System.out.println("Non-Abstract Method3 from Abstract Class");
		System.out.println("Abstract class can have normal as well as abstract methods but it is not mandatory to implement normal methods in SubClass");
	}

}
