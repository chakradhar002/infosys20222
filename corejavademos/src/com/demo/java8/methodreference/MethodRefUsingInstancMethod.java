package com.demo.java8.methodreference;


//we have defined functional interface and referring with  instant method to 
//its funtional method say()
interface Sayable1 {
	void say1();
}
class MethodRef {
	public void saySomething() {
		System.out.println(" my name is instant method");
	}
}

public class MethodRefUsingInstancMethod {

	public static void main(String[] args) {
		
		MethodRef r = new MethodRef();
		
		Sayable1 s= r::saySomething;
		//calling interface method
		s.say1();
		
  //using anonymous object for refering to non static method that is saySomething()
		
		Sayable1 s1 =  new MethodRef()::saySomething;
		s1.say1();
	}

}
