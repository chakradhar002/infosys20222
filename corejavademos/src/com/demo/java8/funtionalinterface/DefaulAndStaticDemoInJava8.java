package com.demo.java8.funtionalinterface;
//incase of fucntional interface we have only
interface add {
	void addResult();
	void addShow(); // 2022
	default public void billing() {
		System.out.println(" my name is default");

	} // 2030 i could not add any new funtionality
	
	public static void show() {
		System.out.println(" my name is stattic of  2022");
		
	}
	public static int show1() {
		System.out.println(" ");
		return 0;
		
	}
}
class MyDemo implements add {
	public void addResult() {
	}
	public void addShow() {

	}
	// i will override the the default method and i will put my own functionaliyt of
	// 2030 in the present day
	public void billing() {
		System.out.println(" my name is my method of 2030");
	}
	
	public static void show() {
		System.out.println(" my name is stattic of  2030");
		
	}
	
	
	public static int show1() {
		System.out.println(" 2030");
		return 2030;
		
	}
}

public class DefaulAndStaticDemoInJava8 {

	public static void main(String[] args) {
		MyDemo d1=null;  //static variable can access only static methods--basic core java logic
				MyDemo d = new MyDemo();
		d.billing();//calling ur version of billing method of 2030
	
     d1.show();
     int k= d1.show1();
     System.out.println(k);
      
	}

}
