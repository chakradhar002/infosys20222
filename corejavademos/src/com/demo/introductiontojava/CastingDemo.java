package com.demo.introductiontojava;

public class CastingDemo {

	public static void main(String[] args) {
		
		String number1="12";
		String number2="12.5";
		// converting string into integer
		
		//
		int result = Integer.parseInt(number1);
		float floatresult = Float.parseFloat(number2);
		
		System.out.println(result);
		
		float i=2.00f;
		
		int result2=(int)i;  //explict  casting
		
		System.out.println(result2);
		System.out.println(floatresult);
		

	}

}
