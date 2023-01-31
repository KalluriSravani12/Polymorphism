package com.example.Maths;
import static java.lang.Math.*;

public class Circle extends Shape {
	private double radius;
	public Circle(double radius) {
		this.radius=radius;
		
	}
	public double getRadius() {
		return radius=PI*pow(2,radius);
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void computeArea() {
		System.out.println("The area of circle is :"+getRadius());
		
	}

}
