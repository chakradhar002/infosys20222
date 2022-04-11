package com.demo.inheritencedemo;

abstract class Mobile {
    //non abstract method
	void brandName() {

		System.out.println("hi"); // declaring method
	}
   //abstract method
	abstract void price();// defined
}

class Iphone extends Mobile {
	// implementing the logic of price defined in abstract class
	void price() {
		System.out.println(" cost is 300000");

	}

}

class Samsung extends Mobile {
	// implementing the logic of price defined in abstract class
	void price() {
		System.out.println(" cost is 20k");

	}

}

public class MobileMain {

	public static void main(String ar[]) {

		Iphone p = new Iphone();
		p.price();

		Samsung s = new Samsung();
		s.price();

	}
}
