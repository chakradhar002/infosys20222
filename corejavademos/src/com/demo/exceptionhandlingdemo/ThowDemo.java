package com.demo.exceptionhandlingdemo;

class Stock {
     //since we took static method thats why we need a classobject referencea variable to call it
	public  void checkStock(int stockAvailable, int quantityRequired) {
		try {
			if (stockAvailable < quantityRequired) {// lgoic as check conditions
				throw new Exception("There is not enough stock available.");

			} else {

				System.out.println("Please proceed to the check-out");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}

public class ThowDemo {

	public static void main(String[] args) {
		
		Stock ss= new Stock();// for non static mehtod calling we need to create the object of that class
		ss.checkStock(6, 7);

		Stock s = null; // this intilized class variable
		s.checkStock(8, 3);
	}

}
