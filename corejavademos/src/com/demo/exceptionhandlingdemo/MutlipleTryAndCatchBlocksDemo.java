package com.demo.exceptionhandlingdemo;

public class MutlipleTryAndCatchBlocksDemo {

	public static void main(String[] args) {
	

		int a = 10; // enter by user
		int b = 0; // eneter here
		
		int arr[]= new int[3];
		
		try {//outer try
			
			try {//inner try
				      
			arr[4]=45;
			}catch(Exception ee) {//inner catch block
				
				System.out.println("index of out bound");
			}
			int c = a / b; // may be error due to wrong input..
			System.out.println(c);
			
		} catch (ArithmeticException e) {
            e.printStackTrace();
           
		}
		 catch (ArrayIndexOutOfBoundsException e) {
	            e.printStackTrace();
	           
			}
		 catch (Exception e) {
	            e.printStackTrace();
	           
			}
		
	}

}
