package com.example.Maths;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape=new Shape();
		shape.computeArea();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the base and height:");
		double result1=input.nextDouble();
		double result2=input.nextDouble();
		Triangle triangle=new Triangle(result1,result2);
		triangle.computeArea();
		System.out.println("Enter the radius:");
		double result=input.nextDouble();
		Circle circle=new Circle(result);
		circle.computeArea();

	}

}
