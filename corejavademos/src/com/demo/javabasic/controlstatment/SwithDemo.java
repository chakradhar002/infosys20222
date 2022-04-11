package com.demo.javabasic.controlstatment;

public class SwithDemo {
	public static void main(String[] args) {
		double discount;
		String customerType = "Premium";
		
		switch (customerType) {
		case "Regular":
			discount = 5;
			break;

		case "Premium":
			discount = 10;
			break;

		default:
			discount = 0;
		}
		System.out.println("Customer has got discount of " + discount + "%");
	}
}