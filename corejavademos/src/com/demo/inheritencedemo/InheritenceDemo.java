package com.demo.inheritencedemo;

class Car {

	public void start() {

		System.out.println(" from parnet class start");
	}

	public void stop() {

		System.out.println(" from parnet class stop");
	}

}

class TataSafri extends Car {
     //invoke first and overrided the parent class version
	public void start() {
		
		

		System.out.println(" from child tat class start");
	}

	public void stop() {

		System.out.println(" from child tata class stop");
	}

}

public class InheritenceDemo {
	public static void main(String ar[]) {
		TataSafri t = new TataSafri(); // creating object of child class
		
	
		
		t.start();
		t.stop();

		

	}

}
