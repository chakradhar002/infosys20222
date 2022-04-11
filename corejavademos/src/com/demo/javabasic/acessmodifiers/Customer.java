package com.demo.javabasic.acessmodifiers;

public abstract class Customer {
	
	public String customerId;
	protected String customerName;
	long contactNumber;
	private String address;
	
	private static int idCounter;
	public Customer() {
		System.out.println("Parameterless constructor called");
	}
	public Customer(String customerId, String customerName, long contactNumber, String address) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	public void displayCustomerDetails() {
		System.out.println("Displaying customer details \n***********");
		System.out.println("Customer Id : " + this.customerId);
		System.out.println("Customer Name : " + this.customerName);
		System.out.println("Contact Number : " + this.contactNumber);
		System.out.println("Address : " + this.address);
	}
	
	public String updateCustomerContact(long newContact) {
		String message = null;
		if (this.contactNumber != newContact) {
			this.contactNumber = newContact;
			message= "Contact updated";
		}
		else
			message = "Provide a new contact";
		
		return message;
			
	}
	
	public abstract void calculateFinalPrice();// this  abstract
}
       //implementation class or concreate class or child class or derived clss
   class CustomerNitu extends Customer{

	@Override
	public void calculateFinalPrice() {
		// TODO Auto-generated method stub
		
	}

	
	   
	   
   }
   
   
   

