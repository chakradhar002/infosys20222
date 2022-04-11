package com.demo.javabasic.controlstatment;

class Day {
	// if demo
	String show(String name) {
		if (name.equals("SAT")) {
			System.out.println("today is sat");

		}
		return name;
	}

//if else demo
	String showIfAndElse(String name) {
		if (name.equals("SAT")) {
			System.out.println("today is sat");
			return name;

		} else {

			return "today is not sat";
		}

	}
	
	//ifelseif demo
	
	String ifElseIfDemo(String name,String month) {
		
		
		if (name.equals("SAT")) {
			if(month.equals("MAR")) {
				System.out.println("today is MAR month");
				
			}
			System.out.println("today is sat");
			return name;

		} else {

			return "today is not sat";
		}
		
		
	}

}

public class ControlStamentDemo {

	public static void main(String[] args) {

		Day d = new Day();

		// String result = d.show("fri");
		// .out.println(result);

		//String s = d.showIfAndElse("SAT1");// CALLING THIS method from here
		//System.out.println(s);\
		
		d.ifElseIfDemo("SAT", "MAR");
	}

}
