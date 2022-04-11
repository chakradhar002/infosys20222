package com.demo.javabasic.acessmodifiers;

public class PersonBanking {
	
	//java bean
	
	private int id=101;   //hard coded------------> these value are come from db databases
	private String name="ram";
	private String address;
	private double salary=1002.3;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = "RAM";
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
