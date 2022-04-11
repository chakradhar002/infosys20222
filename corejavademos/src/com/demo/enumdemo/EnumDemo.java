package com.demo.enumdemo;

public class EnumDemo {

	enum Days {
		mon, tue, wed
	}

	public static void main(String[] args) {

		for (Days m : Days.values()) { //enahance for loop used to iterate the objects

			System.out.println(m);
		}

	}

}
