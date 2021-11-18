package com.tcs.day5;

public abstract class shapeAbstract {
	float x;
	float y;
	
	public float getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	abstract double calculateArea();
	abstract double calculateCircumference();
	
	

}
