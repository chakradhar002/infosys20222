package com.demo.javabasic.oopconcepts;

class Pizza {

    //Attributes
    int price; 
	String size;
	int quantity;
	
	//Constructor
	Pizza (String size, int quantity){ 
		this.size = size;
		this.quantity = quantity;
		
		if(this.size.equals("Regular"))
			this.price = 100;
		else if(this.size.equals("Medium"))
			this.price = 250;
		else
			this.price = 390;
	}
	
	//Method
	public float calculateTotalPrice(Pizza[] pizzaOrdered) {
		int totalPrice = 0;
		for (Pizza pizza : pizzaOrdered) {
			totalPrice += pizza.price * pizza.quantity;
		}
		return 0.95f*totalPrice;
	}
	
}

public class Tester {
	
	public static void main(String[] args) {
		Pizza p1 = new Pizza("Medium",4);
		Pizza p2 = new Pizza("Large", 2);
		Pizza[] pizzaOrdered = {p1, p2};
		float totalCost = p1.calculateTotalPrice(pizzaOrdered);
		System.out.println("Your order is ready! Your bill amount is: "+totalCost);
	}
}