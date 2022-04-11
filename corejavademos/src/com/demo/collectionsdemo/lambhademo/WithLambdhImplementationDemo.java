package com.demo.collectionsdemo.lambhademo;

//with lambdha Expression
@FunctionalInterface
interface Drawable1 {

	void draw();

}


               //functional programing approach-- to creater lesser objects with respective of classes
public class WithLambdhImplementationDemo {

	public static void main(String[] args) {
		int width = 20;

		Drawable1 d2 =()-> {
		// lgoic
			System.out.println(" the value of i " + width);
	};

		d2.draw();

	}
}


