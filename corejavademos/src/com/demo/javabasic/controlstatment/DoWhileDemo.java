package com.demo.javabasic.controlstatment;
 public class DoWhileDemo {
	public static void main(String[] args) {
		int inputNumber = 123;     //Supply different inputs here
		int sumOfDigits = 0;
		int temp = 0;

		do {
			temp = inputNumber % 10;
			sumOfDigits += temp;
			inputNumber = inputNumber / 10;
		} while (inputNumber > 0);

		System.out.println("Sum of digits : " + sumOfDigits);
	}
}