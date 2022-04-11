package com.demo.javabasic.acessmodifiers;

public class PersonBankingMain {

	public static void main(String[] args) {
	
		PersonBanking  person = new PersonBanking();//importing this class
		System.out.println(person.getId());   //not editable
		System.out.println(person.getName());   //not editable
		System.out.println(person.getSalary());  //not editable
		
		person.setAddress("hyd manikonda");  // editable
		
		System.out.println(person.getAddress());
	}

}
