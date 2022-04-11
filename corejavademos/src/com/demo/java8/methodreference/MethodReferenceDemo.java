package com.demo.java8.methodreference;
// we have defined functional interface and referring with  a static method to 
// its funtional method say()
interface Sayable {
	void say();
}
class MethodRefDemo {
	public static void saySomething() {
		System.out.println(" my name is static method");
	}
}

public class MethodReferenceDemo {
	public static void main(String[] args) {
	//reffering static method
		Sayable saydemo = MethodRefDemo::saySomething;//internally it works on the
		//Principle of lambha function as anonymous way calling
		//calling interface method
		saydemo.say();	 
	}

}
