package com.demo.collectionsdemo.lambhademo;

//without lambdha Expression
interface Drawable {

	void draw();
}

public class WithoutLambdhaDemo {
	// without lamdha ,Drawable implemtation using anonymouse class
	public static void main(String[] args) {

		int width = 10;

		Drawable d = new Drawable() {

			public void draw() {

				// lgoic

				System.out.println(" the value of i " + width);

			}

		};

		d.draw();

	}

}
