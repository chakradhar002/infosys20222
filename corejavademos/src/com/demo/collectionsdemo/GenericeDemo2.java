package com.demo.collectionsdemo;
class MyClass<T> { // templete of any data type int or char or strng or else
	T obj; // whcih can hold any data type
	void add(T obj) {  //act like a setter method
		this.obj = obj;
	}
	T get() {
		return obj;
	}
}
public class GenericeDemo2 {

	public static void main(String[] args) {

		MyClass<Integer> s = new MyClass<Integer>();
		s.add(5); /// i am passing integer type

		System.out.println(s.get());

		MyClass<String> s1 = new MyClass<String>();
		s1.add("445"); /// i am passing integer type
		System.out.println(s1.get());
	}

}
