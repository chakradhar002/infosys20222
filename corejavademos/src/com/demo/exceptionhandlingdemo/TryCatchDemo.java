package com.demo.exceptionhandlingdemo;

public class TryCatchDemo {

	public static void main(String[] args) {

		int a = 10; // enter by user
		int b = 0; // eneter here
		try {
			int c = a / b; // may be error due to wrong input..
			System.out.println(c);
			
		} catch (Exception e) {
            e.printStackTrace();
              
              
		}
		
	}

}