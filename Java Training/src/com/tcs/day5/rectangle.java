package com.tcs.day5;

public class rectangle extends shapeAbstract{
	float length;
	float breadth;
	rectangle(float length,float breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return (length*breadth);
	}
	@Override
	double calculateCircumference() {
		// TODO Auto-generated method stub
		return (2*(length+breadth));
	}
	

}
