package com.tcs.day5;

class circle extends shapeAbstract {
	float radius;
	circle(float radius)
	{
		this.radius = radius;
	}
	void setRadius(float radius)
	{
		this.radius = radius;
	}
	double getRadius()
	{
		return radius;
	}
	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return (3.14*radius*radius);
	}

	@Override
	double calculateCircumference() {
		// TODO Auto-generated method stub
		return (2*3.14*radius);
	}
	
	

}
