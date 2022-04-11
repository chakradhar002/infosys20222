package com.demo.javabasic.acessmodifiersmain;

import com.demo.javabasic.acessmodifiers.Addition;
import com.demo.javabasic.acessmodifiers2.Substract;

// this is from another packg

public class AdditionSubstrationMainDemo {

	public static void main(String[] args) { 
	
		Addition adddemo = new Addition();//created the object of ADDiton class
		System.out.println(adddemo.additionShow(12.5, 12.5));
		
		
		Substract sub= new Substract();
		System.out.println(sub.substractionShow(1.5, 1.1));
		
	}

}
