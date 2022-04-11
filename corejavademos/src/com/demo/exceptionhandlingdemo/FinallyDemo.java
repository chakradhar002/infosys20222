package com.demo.exceptionhandlingdemo;

public class FinallyDemo {

	public static void main(String[] args) {

		int a = 10; // enter by user
		int b = 0; // eneter here
		int arr[]= new int[3];
		try {//inner try
		      
			arr[4]=45;
			}
		
		finally {
			//close db connections
			System.out.println("alwaya execute");
		}
	}

}