package com.tcs.day5;

class triangle extends shapeAbstract{
	float baselength;
	float height;
	float side1;
	float side2;
	float side3;
	
	triangle(float baselength,float height,float side1,float side2,float side3)
	{
		this.baselength = baselength;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return (.5*baselength*height);
	}

	@Override
	double calculateCircumference() {
		// TODO Auto-generated method stub
		return (side1+side2+side3);
	}
	

}
