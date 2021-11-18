package com.tcs.day5;

public class shapeApplication {
	public static void main(String[] args)
	{
		shapeAbstract s;
		s = new triangle(10,15,6,6,6);
		System.out.println("Triangle Details :");
		System.out.println("Area is : "+s.calculateArea());
		System.out.println("Circumference is : "+s.calculateCircumference());
		System.out.println(" ");
		
		
		s.setX(20);
		s = new circle(s.getX());
		System.out.println("Circle Details : ");
		System.out.println("Area is : "+s.calculateArea());
		System.out.println("Circumference is : "+s.calculateCircumference());
		System.out.println(" ");

		s.setX(5);
		s.setY(10);
		s = new rectangle(s.getX(),s.getY());
		System.out.println("Rectangle Details : ");
		System.out.println("Area is : "+s.calculateArea());
		System.out.println("Circumference is : "+s.calculateCircumference());
		
		
	}

}
