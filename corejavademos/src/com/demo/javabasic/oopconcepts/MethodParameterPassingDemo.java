package com.demo.javabasic.oopconcepts;

class SubstractDemo {
	/// method with passing parameter
	int subDemo(int number1, int number2) {
                     //78       45
		int result = number1 + number2;
		return result;
	}

}

public class MethodParameterPassingDemo {
	
	public static void main(String ar[]) {
		
		SubstractDemo subdemo= new SubstractDemo();//created the objet  of this class
		
	
	
	System.out.println(subdemo.subDemo(78, 45));//
		
	}

}
