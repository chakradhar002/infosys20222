package com.demo.javabasic.oopconcepts;

class AdditionDemo{
	
	int cc=30;//globle variable or instance variable
	float k=30.8f;//globle variable or instance variable
	
	void sumOfNumber() {
		int a=10;  //local varible
		int b=20;
		int c=40;
		int result = a+b+c+cc;
		System.out.println(result);
	}
	
	//retun type is int
	int sumOfNumbersReturnNumbers() {
		int a=45;  //local varible
		int b=20;
		int c=40;
		int result = a+b+c+cc;
		return result;
		
	}
	//retun type is int
	float sumOfNumbersReturnNumbersUsingFloat() {
		float a=45.2f;  //local varible
		float b=20.3f;
		float c=40.6f;
		float result = a+b+c+k;
		return result;
	}
	
	String name() {
	      String k="2.5";
		String name ="my name is naresh";
		return name+k;
	}
}

public class ReturnTypeAndVariableDemo {
	
	public static void main(String ar[]) {
		AdditionDemo adddemo = new AdditionDemo();
		adddemo.sumOfNumber();
		
		int intdummyresult = adddemo.sumOfNumbersReturnNumbers(); //calling the method of sumOfNumbersReturnNumbers()
		System.out.println(" from  main  "+intdummyresult);
		System.out.println(" from  main  "+adddemo.sumOfNumbersReturnNumbers());
		
		float dummy=adddemo.sumOfNumbersReturnNumbersUsingFloat();
		System.out.println(" from  main float "+dummy);
			
		System.out.println("name is ... "+	adddemo.name());
	}
	
	
	
}
