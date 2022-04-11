package com.demo.java8.methodreference;

@FunctionalInterface
interface Message {
	MyClass say3(String msg);
}

class MyClass {
	// using constructor

	MyClass(String m) {
		System.out.println("hi" + m);
	}
}

public class MethodReferenceConstructorBasedDemo {

	public static void main(String[] args) {

		Message m = MyClass::new;

		m.say3("how are you");
	}

}
