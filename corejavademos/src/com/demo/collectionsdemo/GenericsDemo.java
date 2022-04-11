package com.demo.collectionsdemo;

import java.util.ArrayList;

public class GenericsDemo {

	public static void main(String[] args) {
	           //type safe
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(2); //int
		numList.add(3);  //int
		numList.add(5);//string
		
		System.out.println(numList);
		

	}

}
