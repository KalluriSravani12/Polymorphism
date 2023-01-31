package com.example.persondetails;

public class OtherGender extends Person {
private static final String CLASS_NAME="OtherGender";
	
	public OtherGender(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void printClassName() {
		System.out.println("The person "+name+" belongs to class:"+CLASS_NAME);
	}
	

}
