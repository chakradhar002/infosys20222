package com.infy.bean;
//bean class of student
public class Student {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showDetails() {

		System.out.println("name " + name);
	}

}
