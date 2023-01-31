package com.example.persondetails;

public class Male extends Person {
	private static final String CLASS_NAME="Male";
	
	public Male(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void printClassName() {
		System.out.println("The person "+name+" belongs to class:"+CLASS_NAME);
	}

}
