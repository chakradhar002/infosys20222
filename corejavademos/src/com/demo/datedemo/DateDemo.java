package com.demo.datedemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class DateDemo {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now(); // now() returns the current date from system clock
		System.out.println(today); // output will be today's date
				
		LocalDate dateObj = LocalDate.of(1997, 8, 29); // of() returns the instance of LocalDate 
		                                               //with specified arguements
		System.out.println(dateObj); // output : 1997-08-29

		
		
		LocalDate today1 = LocalDate.now();
		
	
		
	
	}

}
