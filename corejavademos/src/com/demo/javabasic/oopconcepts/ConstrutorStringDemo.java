package com.demo.javabasic.oopconcepts;

class  Customer{
	
	String customername;
	//this is my constructor
	Customer(String name){ //parameterized
		
		this.customername = name;   //Initialized ehre
	}
	//method
	void display() {
		System.out.println(" name of customer is "+customername);
		
	}
	
}


public class ConstrutorStringDemo {

	public static void main(String[] args) {
		
		Customer c = new Customer("jack");
		
		c.display();//method calling
	}

}
