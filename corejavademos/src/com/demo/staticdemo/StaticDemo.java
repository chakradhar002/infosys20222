package com.demo.staticdemo;
public class StaticDemo {
	static int k = 20;// static variable
	// ;// it is static in nature what..class varible
	static {
		System.out.println(" from static block");

	}
	StaticDemo() {
		System.out.println(" from from constructor");
	}
	static void show() {
		int i = 10;
		System.out.println(" from from shwo()" + i);
	}
	static int show1() {
		int i = 10;
		System.out.println(" from from shwo()1" + i);
		return i;
}
	static {
		System.out.println(" from static second");
	}
	public static void main(String[] args) {
		//StaticDemo S= new StaticDemo();//this is for constructor calling
		StaticDemo variables1 = null;

		variables1.show();// calling show() method no need of creating obj
		System.out.println(" from from main()");
	}

}
